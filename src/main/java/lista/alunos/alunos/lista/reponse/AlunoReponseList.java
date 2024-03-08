package lista.alunos.alunos.lista.reponse;

import lista.alunos.alunos.lista.doMain.Aluno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoReponseList {

    private List<Aluno> alunosList;
}
