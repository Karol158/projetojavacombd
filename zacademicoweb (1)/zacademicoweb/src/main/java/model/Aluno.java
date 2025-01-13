package model;

public class Aluno extends Usuario {
    private Escola escolaAnterior;
    private String matricula;
    private ArrayList<NotaSelecao>notaSelecao;
    Aluno(String nome,String cpf,int idade,String emailPessoal,String emailInstitucional,String senha,String matricula){
      super( nome, cpf, idade, emailPessoal, emailInstitucional, senha);
      this.matricula=matricula;
    }
    


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Escola getEscolaAnterior(){
        return this.escolaAnterior;
    }
  public void setEscolaAnterior(Escola escolaAnterior){
    this.escolaAnterior=escolaAnterior;
  }
  public ArrayList<NotaSelecao> getNotaSelecao(){
    return this.notaSelecao;
   
  }
  public void setNotaSelecao(ArrayList<NotaSelecao>notaSelecaos){
    this.notaSelecao=notaSelecao;
  }
}
