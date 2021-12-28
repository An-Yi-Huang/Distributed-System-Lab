package com.neo.provider2.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.neo.core.CandidateInfo;
import com.neo.core.DemoService;
import com.neo.core.GoodByeService;
import com.neo.core.ServiceAge;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Author: Qi Gao
 * Date:2021/12/27
 * Version:1.0.0
 */
@Component
@Service(interfaceClass = ServiceAge.class)
public class DemoServiceImpl implements ServiceAge {

    @Override
    public CandidateInfo[] getCandidate_age(CandidateInfo[] candidates, int age){
        ArrayList<CandidateInfo> list = new ArrayList<>();
        for (CandidateInfo candidate : candidates){
            if(candidate.getAge() <= age){
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