package com.neo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.neo.core.CandidateInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDubboConfiguration
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConsumerApplication.class, args);
        applicationContext.start();
        // we can print the msg here

        // Object demoService = applicationContext.getBean("DemoService");

        ProxyService thirdService = applicationContext.getBean(ProxyService.class);

        System.out.println("start.....");
        CandidateInfo[] candidate_gender = thirdService.getCandidate_gender(candidates, "M");
        displayCandidates(candidate_gender);
        System.out.println("--------------------------------");
        CandidateInfo[] candidate_location = thirdService.getCandidate_location(candidates, "IE");
        displayCandidates(candidate_location);
        System.out.println("--------------------------------");
        CandidateInfo[] candidates_age = thirdService.getCandidate_age(candidates, 40);
        displayCandidates(candidates_age);
        System.out.println("--------------------------------");
        CandidateInfo[] candidate_salary = thirdService.getCandidate_salary(candidates, 30000);
        displayCandidates(candidate_salary);
    }

    public static void displayProfile(CandidateInfo info) {
        System.out.println("|=================================================================================================================|");
        System.out.println("|                                     |                                     |                                     |");
        System.out.println(
                "| Name: " + String.format("%1$-29s", info.getName()) +
                        " | Gender: " + String.format("%1$-27s", (info.getGender() == CandidateInfo.MALE?"Male":"Female")) +
                        " | Age: " + String.format("%1$-30s", info.getAge())+" |");
        System.out.println(
                "| Expected Salary: " + String.format("%1$-19s", info.getSalary()) +
                        " | Location: " + String.format("%1$-24s", info.getLocation()+" years"));
        System.out.println("|                                     |                                     |                                     |");
        System.out.println("|=================================================================================================================|");
    }

    public static void displayCandidates(CandidateInfo[] candidates){
        for (CandidateInfo candidate : candidates){
            displayProfile(candidate);
        }
    }

    public static final CandidateInfo[] candidates = {
            new CandidateInfo("Niki Collier", CandidateInfo.FEMALE, 25, 40000, "IE"),
            new CandidateInfo("Old Geeza", CandidateInfo.MALE, 20, 50000, "UK"),
            new CandidateInfo("Hannah Montana", CandidateInfo.FEMALE, 16, 30000, "TW"),
            new CandidateInfo("Rem Collier", CandidateInfo.MALE, 44, 25000, "IE"),
            new CandidateInfo("Jim Quinn", CandidateInfo.MALE, 55, 34000, "UK"),
            new CandidateInfo("Donald Duck", CandidateInfo.MALE, 35, 27000, "IE")
    };

}
