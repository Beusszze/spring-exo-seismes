package fr.m2i.exercice_seismes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seismes")
public class SeismeController {

    private SeismeService service;

}
