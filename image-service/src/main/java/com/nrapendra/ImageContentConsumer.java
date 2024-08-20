package com.nrapendra;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ImageContentConsumer {

    @JmsListener(destination = "${spring.activemq.destination}", containerFactory = "jmsFactory")
    public void processToDo(){
        //log.info("Consumer> " + store);
    }


}
