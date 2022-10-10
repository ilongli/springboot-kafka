package com.ilongli.springbootkafka.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ilongli
 * @date 2022/10/9 17:57
 */
@RestController
public class ProducerController {

    @Resource
    KafkaTemplate<String, String> kafka;

    @GetMapping("test")
    public String data(String msg) {
        // 通过kafka发送出去
        kafka.send("first", msg);

        return "ok";
    }

}
