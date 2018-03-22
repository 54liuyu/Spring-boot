package cn.ly.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liuyu21 on 2017/12/3.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello HR!";
    }


}
