package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
        return "User service is not responding. Please try later.";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack(){
        return "Department service is not responding. Please try later.";
    }
}
