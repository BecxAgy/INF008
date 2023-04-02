package principal;

import exceptions.NatimortoNaoTemFilhoException;

import java.util.Random;

public class Filha extends Pessoa{
    public Filha(String nome, Pessoa pai) {
        super("Sra "+ nome, pai);
    }

    @Override
    public Pessoa cadastrarFilho(String nome, String sexo) throws NatimortoNaoTemFilhoException {
        Random random = new Random();
        int probab = random.nextInt(2);
        Pessoa filho;

        //sexo masculino
        if(sexo.equalsIgnoreCase("masculino") ) {
            if(probab == 1){
                filho = new Natimorto(nome, this);
            }else {
                filho = new Filho(nome, this);
            }
        }else {
            //sexo feminino
            filho =  new Filha(nome,this);
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
