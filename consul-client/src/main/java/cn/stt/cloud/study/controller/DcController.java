package cn.stt.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/8.
 */
@RestController
public class DcController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc(){
        String services = "Services:"+discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
