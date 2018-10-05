/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

import classes.Aluno;
import classes.Disciplina;
import classes.Matricula;
import classes.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Luis
 */
public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Aluno aluno = new Aluno();
        aluno.setAluNome("Luis");
        aluno.setAluCpf("12345678912");
        aluno.setAluNascimento(converteDate("15/10/1989"));
        
        Professor professor = new Professor();
        professor.setProNome("João");
        professor.setProCpf("98765432123");
        professor.setProNascimento(converteDate("19/06/1874"));
        
        Disciplina disciplina = new Disciplina();
        disciplina.setDisNome("Java");
        disciplina.setDisTurno("Noite");
        disciplina.setProfessor(professor);
        
        Matricula matricula = new Matricula();
        matricula.setProfessor(professor);
        matricula.setAluno(aluno);
        matricula.setDisciplina(disciplina);
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        
        Adicionar(s, aluno, professor, disciplina, matricula);
        
        s.getTransaction().commit();
    }

    private static void Adicionar(Session s, Aluno aluno, Professor professor, Disciplina disciplina, Matricula matricula) {
        s.save(aluno);
        s.save(professor);
        s.save(disciplina);
        s.save(matricula);
    }

    private static Date converteDate(String str) throws ParseException {
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        return fm.parse(str);
    }
    
}
