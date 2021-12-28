package com.neo.consumer;
import com.alibaba.dubbo.config.annotation.Reference;
import com.neo.core.*;
import org.springframework.stereotype.Component;

/**
 * Author: Qi Gao
 * Date:2021/12/27
 * Version:1.0.0
 */
@Component
public class ProxyService {

    // this annotation can help us get the service
/*    @Reference(interfaceClass = DemoService.class,check = false)
    private DemoService demoService;

    @Reference(interfaceClass = GoodByeService.class,check = false)
    private GoodByeService goodByeService;*/

    @Reference(interfaceClass = ServiceSalary.class,check = false)
    private ServiceSalary serviceSalary;

    @Reference(interfaceClass = ServiceAge.class,check = false)
    private ServiceAge serviceAge;

    @Reference(interfaceClass = ServiceGender.class,check = false)
    private ServiceGender serviceGender;

    @Reference(interfaceClass = ServiceLocation.class,check = false)
    private ServiceLocation serviceLocation;
/*
    public String sayHello(String msg) {
        return demoService.sayHello(msg);
    }

    public String goodBye(String msg) {
        return goodByeService.goodBye(msg);
    }*/

    public CandidateInfo[] getCandidate_salary(CandidateInfo[] candidates, int salary) {
        return serviceSalary.getCandidate_salary(candidates, salary);
    }

    public CandidateInfo[] getCandidate_location(CandidateInfo[] candidates, String locat) {
        return serviceLocation.getCandidate_location(candidates, locat);
    }

    public CandidateInfo[] getCandidate_gender(CandidateInfo[] candidates, String gender) {
        return serviceGender.getCandidate_gender(candidates, gender);
    }

    public CandidateInfo[] getCandidate_age(CandidateInfo[] candidates, int age) {
        return serviceAge.getCandidate_age(candidates, age);
    }
}