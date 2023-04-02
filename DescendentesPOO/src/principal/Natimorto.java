package principal;

import exceptions.NatimortoNaoTemFilhoException;

public class Natimorto extends Pessoa{
    public Natimorto(String nome, Pessoa pai) {
        super("Natimorto "+nome, pai);
    }

    @Override
    public Pessoa cadastrarFilho(String nome, String sexo) throws NatimortoNaoTemFilhoException {
        throw new NatimortoNaoTemFilhoException();
    }

    @Override
    public void listarDescendentes() throws NatimortoNaoTemFilhoException {
        throw new NatimortoNaoTemFilhoException();
    }

    @Override
    public Pessoa obterFilho(String nome) throws NatimortoNaoTemFilhoException {
        throw new NatimortoNaoTemFilhoException();
    }


}
