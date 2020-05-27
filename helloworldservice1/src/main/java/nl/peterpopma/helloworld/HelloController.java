package nl.peterpopma.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final GreetingRepository greetingRepository;
    Logger logger = LoggerFactory.getLogger(HelloController.class);

    public HelloController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @GetMapping("/")
    String hello() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Hallo SIDN!";
    }

    @GetMapping("/greetings")
    Iterable<GreetingEntity> greetings() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return greetingRepository.findAll();
    }
}
