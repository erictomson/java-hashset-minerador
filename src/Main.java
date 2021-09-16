import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Criando o conjunto
        Set<String> conjuntoDoMinerador = new HashSet<>();

        /// Adicionando valores ao "set" (conjunto)
        conjuntoDoMinerador.add("Corda");
        conjuntoDoMinerador.add("Lanterna");
        conjuntoDoMinerador.add("Picareta");
        conjuntoDoMinerador.add("Garrafa de água");
        // Próximo item é duplicado - não será adicionado
        conjuntoDoMinerador.add("Lanterna");

        System.out.println("Lista inicial");
        imprimirLista(conjuntoDoMinerador);

        // Removendo um item por valor
        // Set/Hash remove por valor, não índice
        conjuntoDoMinerador.remove("Corda");

        System.out.println("Lista atualizada");
        imprimirLista(conjuntoDoMinerador);
    }

    private static void imprimirLista(Set<String> conjuntoDoMinerador) {
        // Imprimindo a lista
        for(String itemDoMinerador: conjuntoDoMinerador) {
            System.out.println(itemDoMinerador);
        }
    }
}
