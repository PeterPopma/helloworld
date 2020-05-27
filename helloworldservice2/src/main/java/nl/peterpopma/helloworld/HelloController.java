package nl.peterpopma.helloworld;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);


    @Autowired
    private EurekaClient eurekaClient;

    @Value("${service.helloworldservice1}")
    private String helloworldServiceId;

    @GetMapping("/")
    String hello() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Hallo SIDN vanuit service 2!";
    }

    @GetMapping("/greetings")
    String greetings() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        String message = "Service 2 using service 1: ";
        RestTemplate restTemplate = new RestTemplate();
        Application application = eurekaClient.getApplication(helloworldServiceId);
        InstanceInfo instanceInfo = application.getInstances().get(0);
        String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/greetings";

        System.out.println("URL" + url);
        message += restTemplate.getForObject(url, String.class);
        return message;
    }
}
