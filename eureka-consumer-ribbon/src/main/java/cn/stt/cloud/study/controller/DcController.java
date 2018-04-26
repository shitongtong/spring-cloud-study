package cn.stt.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/8.
 */
@RestController
public class DcController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}
