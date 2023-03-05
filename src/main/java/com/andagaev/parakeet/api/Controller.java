package com.andagaev.parakeet.api;

import com.andagaev.parakeet.business.Converter;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @PostMapping("/decimal-to-octal")
    @ResponseBody
    public Response decimalToOctal(@RequestBody Request request) {
        int result = Converter.decimalToOctal(request.getNumber());

        return new Response(result);
    }
    @PostMapping("/octal-to-decimal")
    @ResponseBody
    public Response octalToDecimal(@RequestBody Request request) {
        int result = Converter.octalToDecimal(request.getNumber());

        return new Response(result);
    }
}


    
