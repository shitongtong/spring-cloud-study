package cn.stt.cloud.study.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/8.
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("/dc")
    String consumer();
}
