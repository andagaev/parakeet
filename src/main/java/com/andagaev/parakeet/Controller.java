package com.andagaev.parakeet;

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
        int decimal = request.getNumber();
        int result = 0;
        if (decimal <= 0){
            return new Response(result);
        }
        int countval = 1;

        while (decimal != 0) {

            int remainder = decimal % 8;

            result += remainder * countval;

            countval = countval * 10;
            decimal /= 8;
        }

        return new Response(result);
    }
}


    
