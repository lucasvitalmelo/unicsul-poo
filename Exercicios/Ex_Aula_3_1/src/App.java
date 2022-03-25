import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Paciente p1 = new Paciente();

        System.out.println("\n----------PREENCHA OS DADOS----------\n");
        
        System.out.print("Digite o nome do Paciente: ");
        p1.nome = scan.next();

        System.out.print("Digite o Rg: ");
        p1.rg = scan.next();
        
        System.out.print("Digite o telefone: ");
        p1.telefone = scan.next();

        System.out.print("Digite a data de nascimeto: ");
        p1.dataNascimento = scan.next();

        System.out.print("Digite a profissão: ");
        p1.profissao = scan.next();

        System.out.println("\n----------PACIENTE----------\n");
        
        System.out.println("NOME: " + p1.nome);
        System.out.println("RG: " + p1.rg);
        System.out.println("TELEFONE: " + p1.telefone);
        System.out.println("DATA DE NASCIMENTO: " + p1.dataNascimento);
        System.out.println("PROFISSÃO: " + p1.profissao);

        System.out.println("\n----------PREENCHA OS DADOS----------\n");

        System.out.print("Digite o nome do Paciente: ");
        String nome = scan.next();
        
        Paciente p2 = new Paciente(nome);

        System.out.print("Digite o Rg: ");
        p2.rg = scan.next();
        
        System.out.print("Digite o telefone: ");
        p2.telefone = scan.next();

        System.out.print("Digite a data de nascimeto: ");
        p2.dataNascimento = scan.next();

        System.out.print("Digite a profissão: ");
        p2.profissao = scan.next();


        System.out.println("\n----------PACIENTE----------\n");
        System.out.println("NOME: " + p2.nome);
        System.out.println("RG: " + p2.rg);
        System.out.println("TELEFONE: " + p2.telefone);
        System.out.println("DATA DE NASCIMENTO: " + p2.dataNascimento);
        System.out.println("PROFISSÃO: " + p2.profissao);

        scan.close();
    }
}
