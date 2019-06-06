package me.lhz.service.impl;

import me.lhz.service.AopTargetService;
import org.springframework.stereotype.Service;

@Service
public class AopTargetServiceImpl implements AopTargetService {
    @Override
    public String process(String msg) {
        System.out.println("MyServiceImpl.process: "+ msg);
        return "return success";
    }
}
