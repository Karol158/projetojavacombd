package br.ifpe.jaboatao.zacademicoweb.spring_boot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import  br.ifpe.jaboatao.zacademicoweb.model.dao.AlunoDAO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;;
import rg.springframework.web.bind.annotation.RequestParam;


@Controller;
public class AlunoController {
  
    
    private final model.dao.AlunoDAO alunoDAO;
    public AlunoController(AlunoDao alunoDAO){
        this.alunoDAO=alunoDAO;
    }
   
    RequestMapping("/cadAluno",method=RequestMethod.POST)
    public String cadastraAluno(@ModelAttribute Aluno,aluno Model model){
       alunoDAO.create(aluno);
       model.addAttrinute(attributeName:"aluno",aluno);
        return "resultCadAluno";
    }
}
