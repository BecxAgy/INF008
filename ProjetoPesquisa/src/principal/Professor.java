package principal;

import exceptions.ProfessorNaoTemSubordinadoException;

public class Professor extends Pesquisador{
    public Professor(String nome, Coordenador coordenador) {
        super(nome, coordenador);
    }

    @Override
    public void listarSubordinados() throws ProfessorNaoTemSubordinadoException {
        throw new ProfessorNaoTemSubordinadoException();
    }

    @Override
    public void addSubordinado(Pesquisador pesquisador) throws ProfessorNaoTemSubordinadoException {
        throw new ProfessorNaoTemSubordinadoException();
    }

    @Override
    public double getValor() {
        // R$ 220,00 mais 30% do que paga seu coordenador de pesquisa
        return (220 + ( 0.03* (this.getCoordenador().getValor())));

    }


}
