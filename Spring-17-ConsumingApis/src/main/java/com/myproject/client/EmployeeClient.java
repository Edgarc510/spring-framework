package com.myproject.client;

import com.myproject.dto.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "https://dummyapi.io",name = "EMPLOYEE-CLIENT")
public interface EmployeeClient {
//https://dummyapi.io/data/v1/user?limit=10
    @GetMapping("/data/v1/user?limit=10")
    Employee getEmployee(@RequestHeader("app-id") String id);

}
