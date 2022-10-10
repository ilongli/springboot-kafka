package com.ilongli.springbootkafka;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author ilongli
 * @date 2022/10/9 18:08
 */
@Configuration
public class KafkaConsumer {

    @KafkaListener(topics = "first")
    public void consumerTopic(String msg) {
        System.out.println("消费到消息：" + msg);
    }

}
