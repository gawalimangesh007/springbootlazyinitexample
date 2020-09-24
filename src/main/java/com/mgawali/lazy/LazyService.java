package com.mgawali.lazy;

import org.springframework.stereotype.Service;

@Service
public class LazyService {

    public LazyService(){
        System.out.println("Lazy Service:: Constructor loaded");
    }
    public String hello() {
        return "Hi Guys," + System.lineSeparator() +
                "Hope you all are doing good! " +
                "This is the response from Google Cloud Platform k8s engine. " +
                "PM, "  +
                "AM, "  +
                "NP, "  +
                "VA. " +
                "Thank you!!!";
    }
}