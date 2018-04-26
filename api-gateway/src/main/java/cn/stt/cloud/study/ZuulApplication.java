package cn.stt.cloud.study;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/9.
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }
}
