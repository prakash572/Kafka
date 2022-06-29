package com.example.kafak.Controller;

import com.example.kafak.Services.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApacheKafkaWebController {

	@Autowired
	KafkaSender kafkaSender;

	@GetMapping("/producer")
	public String producer(@RequestParam("message") String message) {
		kafkaSender.send(message);
		System.out.println("Test");
		return "Message sent to the Kafka Topic java_in_use_topic Successfully";
	}
}
