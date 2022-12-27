package tech.hemattie.house_calendar.demo_kafka_consumer.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
class KafkaConsumerService {
  @KafkaListener(topics="event_id", groupId = "1")
  public void start_consumer(String message){
    System.out.printf("message recievd:\t%s", message);
  }
}