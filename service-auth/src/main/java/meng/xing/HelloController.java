package meng.xing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
    @Value("${returnString}")
    private String ret;

    @GetMapping("/hello")
    public String hello() {
        return "service-auth hello" + this.ret;
    }
}
