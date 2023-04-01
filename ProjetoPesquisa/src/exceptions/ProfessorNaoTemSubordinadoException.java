package exceptions;

public class ProfessorNaoTemSubordinadoException extends Exception{
    private String msg;

    public ProfessorNaoTemSubordinadoException(){

    }

    public String getMsg(){
        return "Professores não tem subordinados!";
    }

}
