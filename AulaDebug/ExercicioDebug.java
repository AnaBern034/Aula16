import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ExercicioDebug {
    public static double calcularAreaRetanguloComInputUsuario() {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();{

        double areaRetangulo = base * altura;
        System.out.println("O valor da área é de: " + areaRetangulo);
        return areaRetangulo;}


    }
    public static double calcularSomaAreas() {
        //Exemplo de uso do retorno de outra função
        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();
        System.out.println("A area total de construção é de: "+somaAreas);
        return somaAreas;
    }

    public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(0));
        }
    }

    public static List<Integer> retornarListaNumeros() {
        Integer[] listaNumero = new Integer[3];
        for (int i = 0; i < 3 ; i++) {
        }
        return null;
    }

    public static List<String> mostrarMensagemComQuantidade(List<Integer> quantidade) {
        List<String> nomesExibir = new ArrayList<>();
        for (int i = 0; i < quantidade.size(); i++) {
            nomesExibir.add(quantidade.get(i) + "nomes");
        }
        return nomesExibir;
    }

    public static List<String> retornarListaNomes() {
        System.out.println("Digite a capacidade: ");
        Scanner ler = new Scanner(System.in);
        int capacidade = ler.nextInt();

        List<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(ler.nextLine());
        }
        return listaNomes;
    }

    public static void main(String[] args) {

        System.out.println("=========================================================");
        System.out.println("Exemplo do calculo do retangulo com funções");
        System.out.println("=========================================================");

        calcularSomaAreas();


        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de números com funções");
        System.out.println("=========================================================");
        mostrarTodosOsValoresListaNumero(retornarListaNumeros());


        System.out.println("=========================================================");
        List<Integer> listaNumerosArray = retornarListaNumeros();
        mostrarTodosOsValoresListaNumero(listaNumerosArray);

        List<String> listaNomesComQuantidade = mostrarMensagemComQuantidade(retornarListaNumeros());
        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
        System.out.println("=========================================================");
        System.out.println("Exemplo de array = $listaNomesComQuantidade");

    }
}
