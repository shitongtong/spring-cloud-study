package cn.stt.cloud.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/8.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaConsumerFeignApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerFeignApplication.class).web(true).run(args);
    }
}
