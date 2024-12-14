package org.example.examen.examenllumiquinga.controller;

import com.example.controller.SegModulo;
import com.example.controller.services.SegModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/modulos")
public class SegModuloController {

    @Autowired
    private SegModuloService segModuloService;

    @PostMapping
    public SegModulo createModulo(@RequestBody SegModulo segModulo) {
        return segModuloService.saveModulo(segModulo);
    }

    
}
