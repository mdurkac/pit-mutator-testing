package cz.muni.fi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping(path = "/response")
    public String getResponse() {
        return "response";
    }
}
