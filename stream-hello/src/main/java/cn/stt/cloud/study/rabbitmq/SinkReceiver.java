package cn.stt.cloud.study.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/10.
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receiver(Object payload){
        logger.info("Received: " + payload);
    }
}
