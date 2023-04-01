public class Empresa {
    private Chefe superior;
    private Chefe chefe;

    public Empresa(){
        chefe = new Chefe("Antônia Carla Pereira", null);
    }

    public Chefe getChefe(){
        return this.chefe;
    }


}
