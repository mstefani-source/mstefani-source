package za.vita.interfaces.implementations;

import org.springframework.stereotype.Component;
import za.vita.interfaces.MessageProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component("huyaider")
public class Huyaider implements MessageProvider {
    private static final Logger logger = LoggerFactory.getLogger(Huyaider.class);

    public Huyaider() {
        logger.info("init Huyaider Provider");
    }

    @Override
    public String message() {
        return "Hi huyar";
    }

}