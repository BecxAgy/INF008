package principal;

import exceptions.ProfessorNaoTemSubordinadoException;

public class Coordenador extends Pesquisador {
    public Coordenador(String nome, Coordenador coordenador) {
        super(nome, coordenador);
    }

    public void listarSubordinados() throws ProfessorNaoTemSubordinadoException {


        for (Pesquisador pesquisador : this.getListaSubordinados()){
            System.out.println(pesquisador.getNome());
            if(pesquisador instanceof Coordenador){
                pesquisador.listarSubordinados();
            }

        }



    }





    @Override
    public void addSubordinado(Pesquisador pesquisador) throws ProfessorNaoTemSubordinadoException {
        this.getListaSubordinados().add(pesquisador);
    }

    @Override
    public double getValor() {
        double subordinadosValor = this.getQtdSubordinados() * 2.5/100;

        double valor = 300 - (subordinadosValor*300);

        if(valor < 0){
            return 0;
        }

        return valor;
    }


}
