import exception.EmpregadoNaoTemSubordinadosException;

import java.util.ArrayList;
import java.util.List;

public class Chefe extends Pessoa{
    private ArrayList<Pessoa> subordinados;
    public Chefe(String nome, Pessoa chefe) {
        super(nome, chefe);
        this.subordinados = new ArrayList<Pessoa>();
    }

    @Override
    public void getListaEmpregadosAssociados() throws EmpregadoNaoTemSubordinadosException {
        //percorrer arvore para baixo
        System.out.println("Empregados associados de " + this.getNome());

        for (Pessoa empregado: subordinados) {
            System.out.println(empregado.getNome());
            empregado.getListaEmpregadosAssociados();
        }
    }

    public void inserirSubordinado(Pessoa subordinado){
        subordinados.add(subordinado);
    }
}
