package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Business.IBusiness;
import com.example.demo.Business.MocBusiness;
import com.example.demo.Childs.*; 

@RestController
public class HelloController {

    private final IBusiness business;

    public HelloController(IBusiness business) {
        this.business = business;  // DI 注入 OK
    }

    @GetMapping("/")
    public String hello() {
        var instance1 = new Child("山田", 10, business);
        
        var instance2 = new Child("島田", 19, business);
        instance2.resize(190);
        
        return instance1.greet() +"<br>" +instance2.greet();
    }
    
    @GetMapping("/test")
    public String test() {
        // テスト用にbusinessをMocBusinessに差し替える
        var mocBus = new MocBusiness();
        var instance1 = new Child("山田", 10, mocBus);

        instance1.ChangeSize();

        return instance1.greet();
    }
}