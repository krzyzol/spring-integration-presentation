package pl.dstrzyzewski.presentation.spring.integration.si;

public interface MessageHandler {

    Object handle(String message);

}
