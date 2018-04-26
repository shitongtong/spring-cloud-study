package study;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/8.
 */
//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableHystrix
@SpringCloudApplication
public class EurekaConsumerRibbonHystrixApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerRibbonHystrixApplication.class).web(true).run(args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
