package model;

public class Escola  implements instituicao  {
      private String id_mec;
      private String nome;
      private String endereco;
      private int ano_conclusao;
      private String contato;

      public Escola(String id_mec, String nome,String endereco,int ano_conclusao,String contato){
      this.id_mec=id_mec;
      this.nome=nome;
      this.endereco=endereco;
      this.ano_conclusao=ano_conclusao;
      this.contato=contato;

      }

}

