package ir.mjimani.internationalization.controller;

import ir.mjimani.internationalization.controller.dto.ReqCreatePersonDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    @PostMapping("/create")
    public String create(@Valid @RequestBody ReqCreatePersonDto reqCreatePersonDto) {
        return "True";
    }
}
