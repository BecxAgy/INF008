package exception;

public class EmpregadoNaoTemSubordinadosException extends Exception{
   private String msg;

   public EmpregadoNaoTemSubordinadosException(){

   }

   public String getMsg(){
       return "Não é possível obter a listagem de subordinados! Você é um empregado.";
   }
}
