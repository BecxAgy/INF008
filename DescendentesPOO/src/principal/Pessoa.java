package principal;

import exceptions.NatimortoNaoTemFilhoException;

import java.util.ArrayList;

public abstract class Pessoa {
    //um atributo será utilizado para sabermos a hierarquia da arvore de familia (pai)
    private Pessoa pai;
    private String nome;
    private ArrayList<Pessoa> listaFilhos;

    public Pessoa(String nome, Pessoa pai){
        this.nome = nome;
        this.pai = pai;
        this.listaFilhos = new ArrayList<Pessoa>();
    }

    public abstract Pessoa cadastrarFilho(String nome, String sexo) throws NatimortoNaoTemFilhoException;

    public abstract void listarDescendentes() throws NatimortoNaoTemFilhoException;



    public void listarAscendentes(){
        Pessoa paiAtual = this.getPai();

        if(pai != null){
            System.out.println(paiAtual.getNome());
            paiAtual.listarAscendentes();
        }
    }

    public abstract Pessoa obterFilho(String nome)throws NatimortoNaoTemFilhoException;

    public Pessoa getPai() {
        return pai;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Pessoa> getListaFilhos() {
        return listaFilhos;
    }

}
