package com.springcloud.kafkastream.service;

import com.springcloud.kafkastream.binding.KafkaListenerBinding;
import org.apache.kafka.streams.kstream.KStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import org.springframework.stereotype.Service;


@Service
@EnableBinding(KafkaListenerBinding.class)
public class KafkaListenerService {

    private static final Logger log = LoggerFactory.getLogger(KafkaListenerService.class);

    @StreamListener("input-channel-1")
    public void process(KStream<String, String> input) {
        input.foreach((k, v) -> log.info(String.format("Key: %s, Value: %s,", k, v)));
    }
}
