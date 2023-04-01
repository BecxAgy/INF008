import principal.Coordenador;

public class ProjetoPesquisa {
    private Coordenador coordenador;

    public ProjetoPesquisa(){
        this.coordenador = new Coordenador("Dra. Mara Andrade", null);
    }

    public Coordenador getCoordenador(){
        return this.coordenador;
    }

}
