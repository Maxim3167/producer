package app.project.controller;

import app.project.entity.User;
import app.project.kafka.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducerService kafkaProducerService;

    @PostMapping("/send")
    public ResponseEntity<String> publish(@RequestBody User user) {
        kafkaProducerService.publish(user);
        return ResponseEntity.ok("Json message sent to main kafka topic");
    }
}
