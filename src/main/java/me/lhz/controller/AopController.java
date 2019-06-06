package me.lhz.controller;

import me.lhz.service.AopTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopController {

    @Autowired
    private AopTargetService aopTargetService;

    @GetMapping("/")
    public String index(){
        return aopTargetService.process("my msg");
    }
}
