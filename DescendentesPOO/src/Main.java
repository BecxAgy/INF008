import exceptions.NatimortoNaoTemFilhoException;
import principal.Familia;
import principal.Filho;
import principal.Pessoa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Familia familia = new Familia();

        Pessoa matriarca = familia.getMae();


        //criando filhos
        try{
            matriarca.cadastrarFilho("Caim", "masculino");
            matriarca.cadastrarFilho("Abel", "masculino");
            matriarca.cadastrarFilho("Diana", "feminino");
            Pessoa arthur = matriarca.cadastrarFilho("Arthur", "masculino");

            Pessoa jose = arthur.cadastrarFilho("José", "masculino");

            arthur.cadastrarFilho("Luana", "feminino");

            System.out.println("Achei " + arthur .obterFilho(jose.getNome()).getNome());
            matriarca.listarDescendentes();

            System.out.println("\n============================================\n");

            jose.listarAscendentes();

        }catch(NatimortoNaoTemFilhoException e){
            System.out.println("Natimorto não tem filho");
        }




    }
}
