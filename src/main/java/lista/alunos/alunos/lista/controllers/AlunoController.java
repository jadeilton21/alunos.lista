package lista.alunos.alunos.lista.controllers;

import lista.alunos.alunos.lista.doMain.Aluno;
import lista.alunos.alunos.lista.service.AlunoService;
import org.apache.catalina.LifecycleState;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {


    private final AlunoService alunoService;


    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }



    public ResponseEntity<List<Aluno>> getAlunos(){
        List<Aluno> alunos = this.alunoService.getAlunosFromLibriary();
    }
}
