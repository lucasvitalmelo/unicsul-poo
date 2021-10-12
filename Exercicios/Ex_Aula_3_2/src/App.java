import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Produto p1 = new Produto();

        System.out.println("\n=====================================\n");

        System.out.println("\n----------PREENCHA OS DADOS----------\n");

        System.out.print("Digite a Marca: ");
        p1.marca = scan.next();

        System.out.print("Digite o nome do fabricante: ");
        p1.fabricante = scan.next();

        System.out.print("Digite o código de barras: ");
        p1.cod_barras= scan.next();

        System.out.print("Digite preço: ");
        p1.preco = scan.nextFloat();

        System.out.println("\n----------PRODUTO----------\n");

        System.out.print("\nMarca: " + p1.marca);
        System.out.print("\nFabricante: " + p1.fabricante);
        System.out.print("\nCódigo de barras: " + p1.cod_barras);
        System.out.print("\nPreço: " + p1.preco);

        System.out.println("\n=====================================\n");

        System.out.println("\n----------PREENCHA OS DADOS----------\n");

        System.out.print("Digite a Marca: ");
        String marca = scan.next();

        System.out.print("Digite o nome do fabricante: ");
        String fabricante = scan.next();

        System.out.print("Digite o código de barras: ");
        String codBarras= scan.next();

        System.out.print("Digite preço: ");
        float preco = scan.nextFloat();

        System.out.println("\n----------PRODUTO----------\n");

        Produto p2 = new Produto(marca, fabricante, codBarras, preco);

        System.out.print("\nMarca: " + p2.marca);
        System.out.print("\nFabricante: " + p2.fabricante);
        System.out.print("\nCódigo de barras: " + p2.cod_barras);
        System.out.print("\nPreço: " + p2.preco);

        scan.close();
    }
}
