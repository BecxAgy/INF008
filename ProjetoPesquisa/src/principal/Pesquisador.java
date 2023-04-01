package principal;

import exceptions.ProfessorNaoTemSubordinadoException;

import java.util.ArrayList;

public abstract class Pesquisador {
    private String nome;
    private Pesquisador coordenador;
    private ArrayList<Pesquisador> listaSubordinados;

    public Pesquisador(String nome, Coordenador coordenador){
      this.nome = nome;
      this.coordenador = coordenador;
      this.listaSubordinados = new ArrayList<Pesquisador>();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pesquisador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Pesquisador coordenador) {
        this.coordenador = coordenador;
    }
    public ArrayList<Pesquisador> getListaSubordinados() {
        return listaSubordinados;
    }

    public abstract void listarSubordinados() throws ProfessorNaoTemSubordinadoException;
    public abstract void addSubordinado(Pesquisador pesquisador) throws ProfessorNaoTemSubordinadoException;
    public abstract double getValor();
    public void listarSuperiores() {
        var superiorAtual = this.getCoordenador();

        if(superiorAtual!=null){
            System.out.println("O coordenador de "+this.getNome() + " é " + this.getCoordenador().getNome());
            superiorAtual.listarSuperiores();
        }
    }
    public int getQtdSubordinados() {
        //A quantidade será dos subordinados diretos e indiretos

        int qtdAtual = this.listaSubordinados.size();

        for (Pesquisador subordinados : listaSubordinados) {
            qtdAtual += subordinados.getQtdSubordinados();
        }

        return  qtdAtual;
    }


}
