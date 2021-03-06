package com.nishant.spring.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;

public class KafkaReceiver {


	@KafkaListener(id = "test", topicPattern = "nishant")
	public void listen(@Payload String foo,
			@Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) Integer key,
			@Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
			@Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
		System.out.println(foo);
		System.out.println("Received data>>partition"+partition+"<<>key>"+key+"<<topic>>"+topic);
		System.out.println("-------------------------------------------------------------------");

	}
}
