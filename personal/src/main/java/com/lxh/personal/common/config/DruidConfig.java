package com.lxh.personal.common.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Druid
 */
@Slf4j
@Configuration
@ConfigurationProperties(prefix= "spring.datasource")
public class DruidConfig {

	private String url;

	private String username;

	private String password;

	private String driverClassName;

	private int initialSize;

	private int minIdle;

	private int maxActive;

	private int maxWait;

	private int timeBetweenEvictionRunsMillis;

	private int minEvictableIdleTimeMillis;

	private String validationQuery;

	private boolean testWhileIdle;

	private boolean testOnBorrow;

	private boolean testOnReturn;

	private boolean poolPreparedStatements;

	private int maxPoolPreparedStatementPerConnectionSize;

	private String filters;

	private String connectionProperties;



	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}



	/**
	 * @param url 要设置的 url
	 */
	public void setUrl(String url) {
		this.url = url;
	}



	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}



	/**
	 * @param username 要设置的 username
	 */
	public void setUsername(String username) {
		this.username = username;
	}



	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password 要设置的 password
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return driverClassName
	 */
	public String getDriverClassName() {
		return driverClassName;
	}



	/**
	 * @param driverClassName 要设置的 driverClassName
	 */
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}



	/**
	 * @return initialSize
	 */
	public int getInitialSize() {
		return initialSize;
	}



	/**
	 * @param initialSize 要设置的 initialSize
	 */
	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}



	/**
	 * @return minIdle
	 */
	public int getMinIdle() {
		return minIdle;
	}



	/**
	 * @param minIdle 要设置的 minIdle
	 */
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}



	/**
	 * @return maxActive
	 */
	public int getMaxActive() {
		return maxActive;
	}



	/**
	 * @param maxActive 要设置的 maxActive
	 */
	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}



	/**
	 * @return maxWait
	 */
	public int getMaxWait() {
		return maxWait;
	}



	/**
	 * @param maxWait 要设置的 maxWait
	 */
	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}



	/**
	 * @return timeBetweenEvictionRunsMillis
	 */
	public int getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}



	/**
	 * @param timeBetweenEvictionRunsMillis 要设置的 timeBetweenEvictionRunsMillis
	 */
	public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}



	/**
	 * @return minEvictableIdleTimeMillis
	 */
	public int getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}



	/**
	 * @param minEvictableIdleTimeMillis 要设置的 minEvictableIdleTimeMillis
	 */
	public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}



	/**
	 * @return validationQuery
	 */
	public String getValidationQuery() {
		return validationQuery;
	}



	/**
	 * @param validationQuery 要设置的 validationQuery
	 */
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}



	/**
	 * @return testWhileIdle
	 */
	public boolean isTestWhileIdle() {
		return testWhileIdle;
	}



	/**
	 * @param testWhileIdle 要设置的 testWhileIdle
	 */
	public void setTestWhileIdle(boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}



	/**
	 * @return testOnBorrow
	 */
	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}



	/**
	 * @param testOnBorrow 要设置的 testOnBorrow
	 */
	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}



	/**
	 * @return testOnReturn
	 */
	public boolean isTestOnReturn() {
		return testOnReturn;
	}



	/**
	 * @param testOnReturn 要设置的 testOnReturn
	 */
	public void setTestOnReturn(boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}



	/**
	 * @return poolPreparedStatements
	 */
	public boolean isPoolPreparedStatements() {
		return poolPreparedStatements;
	}



	/**
	 * @param poolPreparedStatements 要设置的 poolPreparedStatements
	 */
	public void setPoolPreparedStatements(boolean poolPreparedStatements) {
		this.poolPreparedStatements = poolPreparedStatements;
	}



	/**
	 * @return maxPoolPreparedStatementPerConnectionSize
	 */
	public int getMaxPoolPreparedStatementPerConnectionSize() {
		return maxPoolPreparedStatementPerConnectionSize;
	}



	/**
	 * @param maxPoolPreparedStatementPerConnectionSize 要设置的 maxPoolPreparedStatementPerConnectionSize
	 */
	public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
		this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
	}



	/**
	 * @return filters
	 */
	public String getFilters() {
		return filters;
	}



	/**
	 * @param filters 要设置的 filters
	 */
	public void setFilters(String filters) {
		this.filters = filters;
	}



	/**
	 * @return connectionProperties
	 */
	public String getConnectionProperties() {
		return connectionProperties;
	}



	/**
	 * @param connectionProperties 要设置的 connectionProperties
	 */
	public void setConnectionProperties(String connectionProperties) {
		this.connectionProperties = connectionProperties;
	}



	@Primary
	@Bean
	public DataSource dataSource(){

		DruidDataSource datasource= new DruidDataSource();

		datasource.setUrl(this.url);
		datasource.setUsername(username);
		datasource.setPassword(password);
		datasource.setDriverClassName(driverClassName);
		datasource.setInitialSize(initialSize);
		datasource.setMinIdle(minIdle);
		datasource.setMaxActive(maxActive);
		datasource.setMaxWait(maxWait);
		datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		datasource.setValidationQuery(validationQuery);
		datasource.setTestWhileIdle(testWhileIdle);
		datasource.setTestOnBorrow(testOnBorrow);
		datasource.setTestOnReturn(testOnReturn);
		datasource.setPoolPreparedStatements(poolPreparedStatements);
		datasource.setMaxPoolPreparedStatementPerConnectionSize(
				maxPoolPreparedStatementPerConnectionSize);
		datasource.setConnectionProperties(connectionProperties);
		try{
			datasource.setFilters(filters);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return datasource;
	}

}