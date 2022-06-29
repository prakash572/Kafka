package com.example.kafak.KafkaConfig;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

	@KafkaListener(topics = "testTopic", groupId = "foo")
	public void listenGroupFoo(String message) {
		System.out.println("Received Message in group foo: " + message);
	}
}
