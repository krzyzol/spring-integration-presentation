package pl.dstrzyzewski.presentation.spring.integration.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.dstrzyzewski.presentation.spring.integration.si.MessageHandler;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageHandler messageHandler;

    @Autowired
    public MessageController(final MessageHandler messageHandler) {
        this.messageHandler = messageHandler;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> writeMessage(@RequestBody final String message) {
        final Object response = messageHandler.handle(message);
        return new ResponseEntity<>(response.toString(), new HttpHeaders(), HttpStatus.CREATED);
    }

}
