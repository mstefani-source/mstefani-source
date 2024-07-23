package za.vita.interfaces.implementations;

import org.springframework.stereotype.Component;
import za.vita.interfaces.MessageProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component("provider")
public class HelloMessage implements MessageProvider {
    private static final Logger logger = LoggerFactory.getLogger(HelloMessage.class);

    public HelloMessage() {
        logger.info("init HelloMessage Provider");
    }

    @Override
    public String message() {
        return "Hi Hello module";
    }

}
