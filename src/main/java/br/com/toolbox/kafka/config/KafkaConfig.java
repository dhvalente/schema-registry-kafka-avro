package br.com.toolbox.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;

public class KafkaConfig {

    @Value("${topic.name}")
    private String topicName;

    public NewTopic createTopic() {
        return new NewTopic(topicName, 3, (short) 1);
    }
}
