package cn.stt.cloud.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/5.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(EurekaApplication.class);
//        builder.bannerMode(Banner.Mode.OFF);
//        builder.web(true).run(args);
    }
}
