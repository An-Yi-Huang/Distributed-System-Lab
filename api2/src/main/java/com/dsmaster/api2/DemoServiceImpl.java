package com.dsmaster.api2;


import com.dsmaster.core.DemoService;
import com.dsmaster.core.GoodByeService;
import org.springframework.stereotype.Component;

@Component

public class DemoServiceImpl implements GoodByeService {
    @Override
    public String goodBye(String msg) {

        String responseMsg = msg + "Good bye, see you next time";
        // We can see what is going on in the api1
        System.out.println(responseMsg);

        return responseMsg;
    }
}