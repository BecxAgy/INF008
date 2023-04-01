import exception.EmpregadoNaoTemSubordinadosException;

public class Main {
    public static void main(String[] args) {

        Empresa coca_cola = new Empresa();
        Chefe luis = new Chefe("Luis", coca_cola.getChefe());
        Chefe rebeca = new Chefe("Rebeca Aguiar", coca_cola.getChefe());
        Empregado matheus = new Empregado("Matheus", rebeca);
        Empregado paulo = new Empregado("Paulo", luis);



        try {
            coca_cola.getChefe().getListaEmpregadosAssociados();
        }catch(EmpregadoNaoTemSubordinadosException e){
            System.out.println(e.getMsg());
        }

        try {
            paulo.getListaEmpregadosAssociados();
        }catch(EmpregadoNaoTemSubordinadosException e){
            System.out.println(e.getMsg());
        }

        paulo.getListaSuperiores();

    }
}