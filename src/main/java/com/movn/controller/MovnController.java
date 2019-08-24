package com.movn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("movn/api/v1/")
public class MovnController {

    @GetMapping(value="/properties", produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getProperties()
    {
        return new ResponseEntity<String>("List mila", HttpStatus.OK);
    }
}
