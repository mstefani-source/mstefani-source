package za.vita.interfaces;

public interface MessageHandler {
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider messageProvider);
    void doMessage();
}
