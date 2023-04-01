import exception.EmpregadoNaoTemSubordinadosException;

public class Empregado extends Pessoa{

    public Empregado(String nome, Pessoa chefe) {
        super(nome, chefe);
    }

    @Override
    public void getListaEmpregadosAssociados() throws EmpregadoNaoTemSubordinadosException {
        throw new EmpregadoNaoTemSubordinadosException();
    }
}
