package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;

@Controller
public class Hello {

    @RequestMapping
    public @ResponseBody String hello() {
        return "Hello!!!";
    }

    @RequestMapping("/async")
    public @ResponseBody Callable<String> asyncSimple() {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Async Hello!!!";
            }
        };
    }
	
}
