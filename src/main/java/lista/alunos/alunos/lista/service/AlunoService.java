package lista.alunos.alunos.lista.service;

import org.springframework.stereotype.Service;

@Service
public class AlunoService {


    private final AlunoService alunoService;


    public AlunoService(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
}
