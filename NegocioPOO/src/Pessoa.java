import exception.EmpregadoNaoTemSubordinadosException;

public abstract class Pessoa {
    private String nome;
    private Pessoa chefe;

    public Pessoa(String nome,Pessoa chefe){
        this.nome = nome;
        this.chefe = chefe;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getChefe() {
        return chefe;
    }

    public void setChefe(Pessoa chefe) {
        this.chefe = chefe;
    }

    public abstract void getListaEmpregadosAssociados() throws EmpregadoNaoTemSubordinadosException;

    public void getListaSuperiores(){
        Pessoa chefeAtual = this.getChefe();

        System.out.println("Os chefes de " + this.nome);
        if(chefeAtual!=null){
            System.out.println("- " + chefeAtual.getNome());
            getListaSuperiores();

        }
    }

}