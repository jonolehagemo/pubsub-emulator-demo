package com.example.pubsub;

import com.example.http.SampleReturnMessage;
import io.micronaut.gcp.pubsub.annotation.PubSubClient;
import io.micronaut.gcp.pubsub.annotation.Topic;

@SuppressWarnings("unused")

@PubSubClient
public interface DemoPublisher {

    @Topic("${pub-sub.topic-name}")
    void send(SampleReturnMessage data);
}
