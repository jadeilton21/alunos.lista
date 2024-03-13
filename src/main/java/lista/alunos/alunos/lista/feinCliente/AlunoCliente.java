package lista.alunos.alunos.lista.feinCliente;

import lista.alunos.alunos.lista.doMain.Aluno;
import lista.alunos.alunos.lista.reponse.AlunoReponseList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "aluno-api", url = "https://alunos-exemplos-api.s3.us-east-2.amazonaws.com/alunos.Json")
public interface AlunoCliente {


    @GetMapping
    AlunoReponseList getAluno();
}
