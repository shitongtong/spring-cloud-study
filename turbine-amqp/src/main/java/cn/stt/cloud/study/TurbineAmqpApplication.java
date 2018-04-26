package cn.stt.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/9.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbineStream
public class TurbineAmqpApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineAmqpApplication.class, args);
    }
}
