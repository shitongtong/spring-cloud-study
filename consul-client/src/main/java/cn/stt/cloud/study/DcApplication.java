package cn.stt.cloud.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/8.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DcApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DcApplication.class).web(true).run(args);
    }
}
