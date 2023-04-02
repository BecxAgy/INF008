package principal;

public class Familia {
    final private Pessoa mae;
    public Familia(){
        this.mae = new Filha("Eva", null);
    }


    public Pessoa getMae() {
        return mae;
    }
}
