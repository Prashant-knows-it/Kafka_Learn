package com.example.Kafka_Learn.kafka;

import com.example.Kafka_Learn.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    @KafkaListener(topics = "spiderman_json", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json Message received -> %s", user.toString()));
    }
}
