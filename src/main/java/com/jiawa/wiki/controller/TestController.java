package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//用来返回字符串
//@Controller //用来返回页面


public class TestController {
    //requestmapping可以支持下面所有的request,通过这样的注解方式写出rest ful的http请求
    //如果只仅限于get请求，那么方法应该为@GetMapping, @PostMapping, etc. 或者用@RequestMapping(value = "/user/1", method = RequestMethod.GET)
    /*
    * Http请求方式常用的有四种，get-查询，post-新增，put-修改，delete-删除
    * GET, POST, PUT, DELETE
    * @return
     */
    @RequestMapping("/hello")
    public String Hello(){
        return "Helloworld";
    }

    @PostMapping("/hello/post")
    public String HelloPost(String name){
        return "Hello World! Post." + name;
    }
}
