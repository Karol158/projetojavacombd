 package br.ifpe.jaboatao.zacademicoweb.model;

 package cadastrousario;

 public class Usuario {
     private String nome;
     private String cpf;
     private int idade;
     private String emailPessoal;
     private String emailInstitucional;
     private String senha;
 
 
     Usuario(String nome,String cpf,int idade,String emailPessoal,String emailInstitucional,String senha){
 
         this.nome = nome;
         this.cpf = cpf;
         this.idade = idade;
         this.emailPessoal = emailPessoal;
         this.emailInstitucional = emailInstitucional;
         this.senha = senha;
 
     }
 
     public String getNome(){
         return this.nome;
 
     }
     
     public void setNome(String nome){
         this.nome = nome;
 
     }
 
     public String getCpf(){
         return this.cpf;
     }
 
     public void setCpf(String cpf){
         this.cpf = cpf;
     }
 
     public int getIdade(){
         return this.idade;
     }
 
     public void setIdade(int idade){
         this.idade = idade;
     }
 
     public String getEmailpessoal(){
         return this.emailPessoal;
     }
 
     public void setEmailpessoal(String emailpessoal){
         this.emailPessoal = emailpessoal;
     }
 
     public String getEmailinstitucional(){
         return this.emailInstitucional;
     }
 
     public void setEmailinstitucional(String emailinstitucional){
         this.emailInstitucional = emailinstitucional;
     }
 
     public String getSenha(){
         return this.senha;
     }
 
     public void setSenha(String senha){
         this.senha = senha;
     }
 
 }
 
