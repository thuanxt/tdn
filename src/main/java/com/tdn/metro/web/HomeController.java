package com.tdn.metro.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by thuan_000 on 4/18/2016.
 */
@Controller
public class HomeController {
    private static final String template = "Hello, %s.";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
