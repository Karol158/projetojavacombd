package model.dao;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import model.Aluno;
@Repository

public class AlunoDAO {
private final JdbcClient jdbcClient;
public AlunoDAO(JdbcClient jdbcClient){
    this.jdbcClient=jdbcClient;

}
public void create(Aluno aluno){
     return jdbcClient.sql(sql:"Insert into aluno(nome,cpf,idade,email pessoal,senha,matricula)values(:nome,:cpf,:idade,:email pessoa,:senha,:matricula)".param(name:"nome",aluno.getNome()).param(name:"cpf",aluno.getCpf()).param(name:"idade",aluno.getIdade()).param(name:"emai pessoal",aluno.getEmailpessoal()).params(name:"senha",aluno.getSenha()).param(name:"matricula",aluno.getMatricula)).update()
}
}
