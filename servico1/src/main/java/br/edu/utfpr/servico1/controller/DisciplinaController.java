package br.edu.utfpr.servico1.controller;

import br.edu.utfpr.servico1.dto.DisciplinaDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {
    @GetMapping
    public ResponseEntity<List<DisciplinaDTO>> getDisciplina() {
        var disciplinas = new ArrayList<DisciplinaDTO>();
        disciplinas.add(new DisciplinaDTO(1L, 30, true));
        disciplinas.add(new DisciplinaDTO(2L, 60, true));
        disciplinas.add(new DisciplinaDTO(3L, 90, true));
        disciplinas.add(new DisciplinaDTO(4L, 45, false));
        return ResponseEntity.ok().body(disciplinas);
    }
}