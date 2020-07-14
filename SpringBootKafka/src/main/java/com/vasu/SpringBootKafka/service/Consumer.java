package com.vasu.SpringBootKafka.service;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class Consumer {

	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@Autowired
	private final ObjectMapper mapper = new ObjectMapper();

	@KafkaListener(topics = "demo", groupId = "group_id")
	public void consume(String message) throws IOException {
		 logger.info(String.format("Consumed message = %s", message));
	}
}
