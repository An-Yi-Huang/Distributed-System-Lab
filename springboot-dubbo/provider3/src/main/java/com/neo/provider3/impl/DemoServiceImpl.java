package com.neo.provider3.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.neo.core.CandidateInfo;
import com.neo.core.ServiceAge;
import com.neo.core.ServiceGender;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Author: Qi Gao
 * Date:2021/12/27
 * Version:1.0.0
 */
@Component
@Service(interfaceClass = ServiceGender.class)
public class DemoServiceImpl implements ServiceGender {


    @Override
    public CandidateInfo[] getCandidate_gender(CandidateInfo[] candidates, String gender) {
        ArrayList<CandidateInfo> list = new ArrayList<>();
        for (CandidateInfo candidate : candidates){
            if(gender.equals(candidate.getGender())){
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