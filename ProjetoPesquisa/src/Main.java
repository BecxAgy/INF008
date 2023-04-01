import exceptions.ProfessorNaoTemSubordinadoException;
import principal.Coordenador;
import principal.Professor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProjetoPesquisa labrasoft = new ProjetoPesquisa();

        Coordenador mariaLua = new Coordenador("Maria Lua", labrasoft.getCoordenador());
        Coordenador rebeca = new Coordenador("Rebeca", mariaLua);

        Professor julia = new Professor("Julia", mariaLua );
        Professor luis = new Professor("Luis Andre", mariaLua);
        Professor matheus = new Professor("Matheus", mariaLua);

        try {
            labrasoft.getCoordenador().addSubordinado(mariaLua);
            mariaLua.addSubordinado(julia);
            mariaLua.addSubordinado(luis);
            rebeca.addSubordinado(mariaLua);

            rebeca.listarSubordinados();
        }catch (ProfessorNaoTemSubordinadoException e){
            System.out.println(e.getMsg());
        }


     matheus.listarSuperiores();




    }

}