package classes;
// Generated 05/10/2018 12:32:58 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Disciplina generated by hbm2java
 */
public class Disciplina  implements java.io.Serializable {


     private Integer disId;
     private Professor professor;
     private String disNome;
     private String disTurno;
     private Set matriculas = new HashSet(0);

    public Disciplina() {
    }

	
    public Disciplina(Professor professor, String disNome, String disTurno) {
        this.professor = professor;
        this.disNome = disNome;
        this.disTurno = disTurno;
    }
    public Disciplina(Professor professor, String disNome, String disTurno, Set matriculas) {
       this.professor = professor;
       this.disNome = disNome;
       this.disTurno = disTurno;
       this.matriculas = matriculas;
    }
   
    public Integer getDisId() {
        return this.disId;
    }
    
    public void setDisId(Integer disId) {
        this.disId = disId;
    }
    public Professor getProfessor() {
        return this.professor;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public String getDisNome() {
        return this.disNome;
    }
    
    public void setDisNome(String disNome) {
        this.disNome = disNome;
    }
    public String getDisTurno() {
        return this.disTurno;
    }
    
    public void setDisTurno(String disTurno) {
        this.disTurno = disTurno;
    }
    public Set getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set matriculas) {
        this.matriculas = matriculas;
    }




}

