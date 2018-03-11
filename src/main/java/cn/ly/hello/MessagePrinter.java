package cn.ly.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by liuyu21 on 2017/12/3.
 */
@Component
public class MessagePrinter {

    @Autowired
    private MessageService service;

    /*final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }*/

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
