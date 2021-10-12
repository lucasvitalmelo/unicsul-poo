import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Vendedor v1 = new Vendedor();

        System.out.println("Digite o nome do vendedor: ");
        v1.setNome(scan.next());

        System.out.println("Digite o salario: ");
        v1.setSalario(scan.nextFloat());

        System.out.println("Digite suas vendas: ");
        v1.setVenda(scan.nextFloat());

        System.out.println("Digite suas faltas: ");
        v1.setFalta(scan.nextInt());

        v1.imprimirDados();
        v1.calcularSalario();
        scan.close();

    }
}
