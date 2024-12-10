package br.edu.utfpr.servico1.controller;

import br.edu.utfpr.servico1.dto.CursoDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @GetMapping
    public ResponseEntity<CursoDTO> getCurso() {
        var curso = new CursoDTO(1L, "Software", 4000);
        return ResponseEntity.ok().body(curso);
    }
}