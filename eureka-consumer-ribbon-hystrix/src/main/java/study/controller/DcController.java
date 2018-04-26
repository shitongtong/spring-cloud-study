package study.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }

    @Service
    class ConsumerService{
        @Autowired
        private RestTemplate restTemplate;

        @HystrixCommand(fallbackMethod = "fallback")
        public String consumer(){
            return restTemplate.getForObject("http://eureka-client/dc", String.class);
        }

        public String fallback(){
            return "fallback";
        }
    }
}
