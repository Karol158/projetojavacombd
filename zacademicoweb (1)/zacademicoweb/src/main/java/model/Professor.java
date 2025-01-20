package model;

public class Professor extends Usuario  {
    private String  siape;
    private String  areaforma;
    private String  nivelinstru;
      
    Professor(String nome,String cpf,int idade,String emailPessoal,String emailInstitucional,String senha,String siape,String areaforma,String nivelinstru){
        super( nome, cpf, idade, emailPessoal, emailInstitucional, senha);
        
        this.siape=siape;
        this.areaforma=areaforma;
        this.nivelinstru=nivelinstru;
    
    }
    
        public String getSiape() {
            return this.siape;
        }
    
        public void setSiape(String siape) {
            this.siape = siape;
        }
    
        public String getAreaforma() {
            return this.areaforma;
        }
    
        public void setAreaforma(String areaforma) {
            this.areaforma = areaforma;
        }
    
        public String getNivelinstru() {
            return this.nivelinstru;
        }
    
        public void setNivelinstru(String nivelinstru) {
            this.nivelinstru = nivelinstru;
        }
    
    }
    