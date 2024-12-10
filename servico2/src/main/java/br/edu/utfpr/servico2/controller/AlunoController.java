package br.edu.utfpr.servico2.controller;

import br.edu.utfpr.servico2.dto.AlunoDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @GetMapping
    public ResponseEntity<AlunoDTO> getAluno() {
        var aluno = new AlunoDTO(1L, "João", 1234, true);
        return ResponseEntity.ok().body(aluno);
    }
}