package nl.peterpopma.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final GreetingRepository greetingRepository;

    public HelloController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @GetMapping("/")
    String hello() {
        return "Hallo SIDN!";
    }

    @GetMapping("/greetings")
    Iterable<GreetingEntity> greetings() {
        return greetingRepository.findAll();
    }
}
