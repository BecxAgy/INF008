package principal;

import exceptions.NatimortoNaoTemFilhoException;

public class Filho extends Pessoa {
    public Filho(String nome, Pessoa pai) {
        super("Sr "+ nome,pai);
    }

    @Override
    public Pessoa cadastrarFilho(String nome, String sexo) throws NatimortoNaoTemFilhoException {
        var tamLista = this.getListaFilhos().size();
        Pessoa filho;

        if(tamLista == 1){
            filho = new Natimorto(nome, this);
        }else {
            if (sexo.equalsIgnoreCase("masculino")) {
                filho = new Filho(nome, this);
            } else {
                filho = new Filha(nome, this);
            }
        }

        this.getListaFilhos().add(filho);
        return filho;

    }

    @Override
    public void listarDescendentes() throws NatimortoNaoTemFilhoException {
        var lista = this.getListaFilhos();

        for (Pessoa descendente:lista) {
            System.out.println(descendente.getNome() + " é descendente de " + this.getNome());

            if(!(descendente instanceof Natimorto)){
                descendente.listarDescendentes();
            }//se o filho for um natimorto ele não lista
        }
    }

    @Override
    public Pessoa obterFilho(String nome) throws NatimortoNaoTemFilhoException {
        var lista = this.getListaFilhos();

        for (Pessoa descendente : lista) {

            //verifico se o nome do descendente é igual ao o fornecido
            if(nome.equalsIgnoreCase(descendente.getNome())){
                return descendente;
            }else if (!(descendente instanceof Natimorto)) {
                descendente.obterFilho(nome);
            }

        }
        return null;
    }


}
