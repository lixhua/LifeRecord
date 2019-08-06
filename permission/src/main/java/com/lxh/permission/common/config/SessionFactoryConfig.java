package com.lxh.permission.common.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@MapperScan({
    "com.lxh.permission.common.mybatis.dao", "com.lxh.permission.commerce.mybatis.dao"
})
public class SessionFactoryConfig {
    
    @Autowired
    private DataSource dataSource;

    protected Resource[] getResources()
        throws IOException {

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath*:com/lxh/permission/common/mybatis/mapper/*.xml");
        Resource[] dest = resolver.getResources("classpath*:com/lxh/permission/commerce/mybatis/mapper/*.xml");
        return ArrayUtils.addAll(resources, dest);
    }

    /**
     * 创建sqlSessionFactoryBean 实例 并且设置configtion 如驼峰命名.等等 设置mapper 映射路径 设置datasource数据源
     *
     * @return
     * @throws IOException
     * @throws Exception
     */
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean(PageInterceptor pageInterceptor)
        throws IOException {
        
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        /** 设置mybatis configuration 扫描路径 */
        sqlSessionFactoryBean.setMapperLocations(getResources());
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        sqlSessionFactoryBean.setConfiguration(configuration);
        /** 设置分页 */
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{
            pageInterceptor
        });
        /** 设置datasource */
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }
    
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        
        return new SqlSessionTemplate(sqlSessionFactory);
    }
    
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        
        return new DataSourceTransactionManager(dataSource);
    }
    
    /**
     *
     * 加载分页插件
     * @return PageInterceptor
     */
    @Bean
    public PageInterceptor pageInterceptor() {
        
        PageInterceptor pageHelper = new PageInterceptor();
        Properties p = new Properties();
        p.setProperty("reasonable", "true");

        //单数据源方言设置
        p.setProperty("helperDialect", "mysql");
//        p.setProperty("helperDialect", "oracle");
//        p.setProperty("helperDialect", "sqlserver");

        //多数据源时开启 closeConn：true
//        p.setProperty("autoRuntimeDialect", "true");
//        p.setProperty("closeConn","true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
    
}
