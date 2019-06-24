package com.zhouyn.demo.kafkaConsumer.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

@Service
public interface InputMessageService {
    @Input("message-in")
    MessageChannel input();
}
