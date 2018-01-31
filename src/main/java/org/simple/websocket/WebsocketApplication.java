package org.simple.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@ServletComponentScan
public class WebsocketApplication {

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("index_js")
    public String indexJs() {
        return "index_js";
    }

    public static void main(String[] args) {
        SpringApplication.run(WebsocketApplication.class, args);
    }
}
