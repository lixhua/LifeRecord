package com.lxh.permission.commerce.controller;

import com.lxh.permission.commerce.Service.SysUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController("/base")
public class BaseController {

    @Resource
    private SysUserService sysUserService;

    @PostMapping("/test")
    public Object csBase(@RequestBody String fileName){
        System.out.println("被调用方法");
        System.out.println(fileName);
        String s = "aaa";
        return s;
//        return sysUserService.selectAll();
    }

    @PostMapping("/upload/test")
    public Object uploadTest(@RequestParam("file") MultipartFile file, @RequestParam("fileName") String fileName){
        Map map = new HashMap();
        map.put("fileName",file.getOriginalFilename());
        System.out.println(fileName);
        System.out.println(file.getOriginalFilename());
        map.put("succsss","成功");
        return map;
    }
}
