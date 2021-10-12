import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Produto prod1 = new Produto();
        Paciente paciente1 = new Paciente();

        System.out.println("\n\nDigite a marca do produto: ");
        prod1.setMarca(scanner.nextLine());

        System.out.println("Digite o nome do fabricante: ");
        prod1.setFabricante(scanner.nextLine());

        System.out.println("Digite o codigo de barras: ");
        prod1.setCod_barras(scanner.nextLine());

        System.out.println("Digite o valor do produto: ");
        prod1.setPreco(scanner.nextFloat());

        System.out.println("\n-------------------- PRODUTO --------------------");
        System.out.println("\nMarca: " + prod1.getMarca());
        System.out.println("Fabricante: " + prod1.getFabricante());
        System.out.println("Código de barras: " + prod1.getCod_barras());
        System.out.println("Preço: " + prod1.getPreco());


        System.out.println("\n====================================================");
        System.out.println("====================================================");


        System.out.println("\nDigite o nome do paciente: ");
        paciente1.setNome(scanner.next());

        System.out.println("Digite o RG: ");
        paciente1.setRg(scanner.next());

        System.out.println("Digite o endereço: ");
        paciente1.setEndereco(scanner.next());

        System.out.println("Digite o número de telefone: ");
        paciente1.setTelefone(scanner.next());

        System.out.println("Digite a data de nascimento: ");
        paciente1.setDatanascimento(scanner.next());

        System.out.println("Digite a profissão: ");
        paciente1.setProfissao(scanner.next());

        System.out.println("\n-------------------- PACIENTE --------------------");
        System.out.println("\nNome: " + paciente1.getNome());
        System.out.println("Rg: " + paciente1.getRg());
        System.out.println("Endereço: " + paciente1.getEndereco());
        System.out.println("Telefone: " + paciente1.getTelefone());
        System.out.println("Data de Nascimento: " + paciente1.getDatanascimento());
        System.out.println("Profissão: " + paciente1.getProfissao());

        scanner.close();
    }
}
