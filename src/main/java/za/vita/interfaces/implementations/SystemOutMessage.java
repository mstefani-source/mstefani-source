package za.vita.interfaces.implementations;

import org.springframework.stereotype.Component;
import za.vita.interfaces.MessageHandler;
import za.vita.interfaces.MessageProvider;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component("systemsHandler")
public class SystemOutMessage implements MessageHandler {
    
    private static final Logger logger = LoggerFactory.getLogger(SystemOutMessage.class);
    
    private MessageProvider messageProvider;

    public SystemOutMessage() {
        logger.info("init SystemOutMessage Handler");
    }

    public SystemOutMessage(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    @Override
    @Resource(name="huyaider")
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void doMessage() {
        if (messageProvider == null)
            throw new RuntimeException("message Provider is null");
        System.out.println(messageProvider.message());
    }

}
