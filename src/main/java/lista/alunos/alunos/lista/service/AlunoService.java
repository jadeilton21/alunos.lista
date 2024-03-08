package lista.alunos.alunos.lista.service;

import lista.alunos.alunos.lista.doMain.Aluno;
import lista.alunos.alunos.lista.feinCliente.AlunoCliente;
import lista.alunos.alunos.lista.reponse.AlunoReponseList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {


    private final AlunoCliente alunoCliente;


    public AlunoService(AlunoCliente alunoCliente) {
        this.alunoCliente = alunoCliente;
    }


    public List<Aluno> getAlunosFromLibriary(){
        AlunoReponseList reponseList = this.alunoCliente.getAluno();
        return reponseList.getAlunosList();
    }
}
