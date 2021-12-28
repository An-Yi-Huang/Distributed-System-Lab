package com.neo.provider4.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.neo.core.CandidateInfo;
import com.neo.core.ServiceGender;
import com.neo.core.ServiceLocation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Author: Qi Gao
 * Date:2021/12/27
 * Version:1.0.0
 */
@Component
@Service(interfaceClass = ServiceLocation.class)
public class DemoServiceImpl implements ServiceLocation {


    @Override
    public CandidateInfo[] getCandidate_location(CandidateInfo[] candidates, String location) {
        ArrayList<CandidateInfo> list = new ArrayList<>();
        for (CandidateInfo candidate : candidates){
            if(location.equals(candidate.getLocation())){
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