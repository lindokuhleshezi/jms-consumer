package com.comsumer.service;

import org.json.JSONObject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class RabbitMQListner implements MessageListener{
	
	public void onMessage(Message message) {	
		
		JSONObject jo = new JSONObject(new String(message.getBody()));		
		log.info("Hello "+jo.get("message")+", i am your father!" );
		
	}
}
