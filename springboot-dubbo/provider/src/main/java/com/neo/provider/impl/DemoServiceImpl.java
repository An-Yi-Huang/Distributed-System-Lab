package com.neo.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.neo.core.CandidateInfo;
import com.neo.core.DemoService;
import com.neo.core.ServiceSalary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Author: Qi Gao
 * Date:2021/12/27
 * Version:1.0.0
 */
@Component
@Service(interfaceClass = ServiceSalary.class)
public class DemoServiceImpl implements ServiceSalary {


    @Override
    public CandidateInfo[] getCandidate_salary(CandidateInfo[] candidates, int salary){
        ArrayList<CandidateInfo> list = new ArrayList<>();
        for (CandidateInfo candidate : candidates){
            if(candidate.getSalary() <= salary){
                list.add(candidate);
            }
        }
        CandidateInfo[] result = new CandidateInfo[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}