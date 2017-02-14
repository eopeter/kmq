package com.softwaremill.kmq.example.standalone;

import com.softwaremill.kmq.KafkaClients;
import com.softwaremill.kmq.KmqConfig;

import java.time.Duration;

class StandaloneConfig {
    static final KmqConfig KMQ_CONFIG = new KmqConfig("queue", "markers", "kmq_client",
            "kmq_redelivery", Duration.ofSeconds(10).toMillis(), "kmq_started_markers");

    static final KafkaClients KAFKA_CLIENTS = new KafkaClients("localhost:9092");
}
