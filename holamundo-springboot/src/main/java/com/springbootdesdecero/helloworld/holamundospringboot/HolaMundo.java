package com.springbootdesdecero.helloworld.holamundospringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class HolaMundo {

    @GetMapping()
    @ResponseBody
    public String mostarMensaje3() {
        return "Hola Mundo Spring Boot por defecto";
    }

    @GetMapping("/holamundo1")
    @ResponseBody
    public String mostarMensaje1() {
        return "Hola Mundo Spring Boot 1";
    }

    @GetMapping("/holamundo2")
    @ResponseBody
    public String mostarMensaje2() {
        return "Hola Mundo Spring Boot 2";
    }
}
