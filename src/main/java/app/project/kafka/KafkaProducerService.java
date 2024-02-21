package app.project.kafka;

import app.project.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducerService {
    private final KafkaTemplate<String, User> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publish(User user) {
        kafkaTemplate.send("main-topic", user);
        log.info("Success");
    }
}
