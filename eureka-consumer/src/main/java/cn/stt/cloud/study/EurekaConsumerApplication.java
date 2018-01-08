package cn.stt.cloud.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/8.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConsumerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerApplication.class).web(true).run(args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
