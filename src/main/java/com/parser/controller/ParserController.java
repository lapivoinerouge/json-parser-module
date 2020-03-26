package com.parser.controller;

import com.parser.dto.ParserDataDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parser")
public class ParserController {

    @PostMapping(value = "/")
    public void addData(@RequestBody ParserDataDto parserData) {

    }

}
