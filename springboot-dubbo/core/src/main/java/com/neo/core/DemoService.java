package com.neo.core;

/**
 * Author: Qi Gao
 * Date:2021/12/27
 * Version:1.0.0
 */
public interface DemoService {

    // This is a interface that provide a model that let provider can implement
    String sayHello(String msg);

    CandidateInfo[] getCandidate_salary(CandidateInfo[] candidates, int salary);
    CandidateInfo[] getCandidate_location(CandidateInfo[] candidates, char location);
    CandidateInfo[] getCandidate_gender(CandidateInfo[] candidates, char gender);
    CandidateInfo[] getCandidate_age(CandidateInfo[] candidates, int age);
}
