package com.nrapendra.controllers;

import com.nrapendra.producers.ImageContentProducer;
import com.nrapendra.models.ImageContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ImageContentController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    ImageContentProducer imageContentProducer;

    @Value("${spring.activemq.destination}")
    private String destination;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody ImageContent imageContent){
        imageContentProducer.sendTo(destination, imageContent);
        return "Success";
    }

}
