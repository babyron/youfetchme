package me.youfetch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class YoufetchmeApplication {

    @RequestMapping("/")
    public Map<String, String> hello() {
        Map<String, String> m = new HashMap<>();
        m.put("hello", "world");
        return m;
    }

    public static void main(String[] args) {
        SpringApplication.run(YoufetchmeApplication.class, args);
    }
}
