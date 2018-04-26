package cn.stt.cloud.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/1/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@EnableBinding(value = {SinkApplicationTests.SinkSender.class})
public class SinkApplicationTests {

    public interface SinkSender {
        String OUTPUT = "input";

        @Output(SinkSender.OUTPUT)
        MessageChannel output();
    }

    @Autowired
    private SinkSender sinkSender;

    @Test
    public void sinkSenderTest() {
        sinkSender.output().send(MessageBuilder.withPayload("produce a message ：http://blog.didispace.com").build());
    }
}
