import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("--------------------- Método 1 ---------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("           <dev ta='LA$CADO'> BANCO </dev>          ");
        System.out.println("----------------------------------------------------");

        String tipo1 = "";

        while (true) {

            System.out.print("\nDigite o tipo da conta  \n\n");
            System.out.print("'C' para Corrente \n'P' para Poupança \n\nDigite a Opção deseja: ");
            tipo1 = scan.next().toLowerCase();

            if (tipo1.charAt(0) == 'c') {

                tipo1 = "c";
                break;

            } else if (tipo1.charAt(0) == 'p') {

                tipo1 = "p";
                break;

            } else {

                System.out.println("\n\n*****************");
                System.out.println("* Tipo Inválido *");
                System.out.println("*****************\n\n");
            }
        }
        ;

        System.out.print("Digite o nome da conta: ");
        String nome1 = scan.next();

        System.out.print("Digite o saldo: ");
        float saldo1 = scan.nextFloat();

        System.out.print("Digite o limete de conta: ");
        float limite1 = scan.nextFloat();

        ContaCorrente conta1 = new ContaCorrente(nome1, saldo1, limite1, tipo1.charAt(0));

        boolean continuar = true;
        while (continuar) {

            System.out.println("\n\n'1' - Depositar.\n'2' - Sacar.\n\nDigite a Opção deseja: ");
            int depositarOuScar = scan.nextInt();

            if (depositarOuScar == 1) {

                System.out.println("=====================");
                System.out.println("Digite o Valor: ");
                float deposito = scan.nextFloat();

                conta1.depositar(deposito);

                System.out.println(conta1.imprimeDados());

            } else if (depositarOuScar == 2) {

                System.out.println("=====================");
                System.out.println("Digite o Valor: ");
                float saque = scan.nextFloat();

                conta1.sacar(saque);

                System.out.println(conta1.imprimeDados());

            } else {

                System.out.println("*** Função invalida! ***");

            }

            while (continuar) {
                System.out.print("\n\n*** Deseja realizar mais alguma operação? ***\n'S' para SIM\n'N' para NÃO\n");
                System.out.print("Qual opção desejada: ");
                char loop = scan.next().toLowerCase().charAt(0);

                if (loop == 'n') {
                    continuar = false;
                } else if (loop == 's') {
                    break;
                } else {
                    System.out.println("** Função inválida! **");
                }
            }

        }
        System.out.println("\n");
        System.out.println("--------------------- Método 2 ---------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("           <dev ta='LA$CADO'> BANCO </dev>          ");
        System.out.println("----------------------------------------------------");

        String tipo2 = "";

        while (true) {

            System.out.print("\nDigite o tipo da conta  \n\n");
            System.out.print("'C' para Corrente \n'P' para Poupança \n\nDigite a Opção deseja: ");
            tipo2 = scan.next().toLowerCase();

            if (tipo2.charAt(0) == 'c') {

                tipo2 = "c";
                break;

            } else if (tipo2.charAt(0) == 'p') {

                tipo2 = "p";
                break;

            } else {

                System.out.println("\n\n*****************");
                System.out.println("* Tipo Inválido *");
                System.out.println("*****************\n\n");
            }
        }
        ;

        System.out.print("Digite o nome da conta: ");
        String nome2 = scan.next();

        System.out.print("Digite o saldo: ");
        float saldo2 = scan.nextFloat();

        ContaCorrente conta2 = new ContaCorrente(nome2, saldo2, tipo2.charAt(0));

        boolean continue2 = true;
        while (continue2) {

            System.out.println("\n\n'1' - Depositar.\n'2' - Sacar.\n\nDigite a Opção deseja: ");
            int depositarOuScar = scan.nextInt();

            if (depositarOuScar == 1) {

                System.out.println("=====================");
                System.out.println("Digite o Valor: ");
                float deposito = scan.nextFloat();

                conta2.depositar(deposito);

                System.out.println(conta2.imprimeDados());

            } else if (depositarOuScar == 2) {

                System.out.println("=====================");
                System.out.println("Digite o Valor: ");
                float saque = scan.nextFloat();

                conta2.sacar(saque);

                System.out.println(conta2.imprimeDados());

            } else {

                System.out.println("*** Função invalida! ***");

            }

            while (continue2) {
                System.out.print("\n\n*** Deseja realizar mais alguma operação? ***\n'S' para SIM\n'N' para NÃO\n");
                System.out.print("Qual opção desejada: ");
                char loop = scan.next().toLowerCase().charAt(0);

                if (loop == 'n') {
                    continue2 = false;
                } else if (loop == 's') {
                    break;
                } else {
                    System.out.println("** Função inválida! **");
                }
            }
        }

        System.out.println("\n");
        System.out.println("--------------------- Método 3 ---------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("           <dev ta='LA$CADO'> BANCO </dev>          ");
        System.out.println("----------------------------------------------------");

        ContaCorrente conta3 = new ContaCorrente();

        String tipo3 = "";
        while (true) {

            System.out.print("\nDigite o tipo da conta  \n\n");
            System.out.print("'C' para Corrente \n'P' para Poupança \n\nDigite a Opção deseja: ");
            tipo3 = scan.next().toLowerCase();

            if (tipo3.charAt(0) == 'c') {

                tipo3 = "c";
                break;

            } else if (tipo3.charAt(0) == 'p') {

                tipo3 = "p";
                break;

            } else {

                System.out.println("\n\n*****************");
                System.out.println("* Tipo Inválido *");
                System.out.println("*****************\n\n");
            }
        }
        ;

        System.out.print("Digite o nome da conta: ");
        conta3.nome = scan.next();

        System.out.print("Digite o saldo: ");
        conta3.saldo = scan.nextFloat();

        System.out.print("Digite o limete de conta: ");
        conta3.limite = scan.nextFloat();


        boolean continue3 = true;
        while (continue3) {

            System.out.println("\n\n'1' - Depositar.\n'2' - Sacar.\n\nDigite a Opção deseja: ");
            int depositarOuScar = scan.nextInt();

            if (depositarOuScar == 1) {

                System.out.println("=====================");
                System.out.println("Digite o Valor: ");
                float deposito = scan.nextFloat();

                conta3.depositar(deposito);

                System.out.println(conta3.imprimeDados());

            } else if (depositarOuScar == 2) {

                System.out.println("=====================");
                System.out.println("Digite o Valor: ");
                float saque = scan.nextFloat();

                conta3.sacar(saque);

                System.out.println(conta3.imprimeDados());

            } else {

                System.out.println("*** Função invalida! ***");

            }

            while (continue3) {
                System.out.print("\n\n*** Deseja realizar mais alguma operação? ***\n'S' para SIM\n'N' para NÃO\n");
                System.out.print("Qual opção desejada: ");
                char loop = scan.next().toLowerCase().charAt(0);

                if (loop == 'n') {
                    continue3 = false;
                } else if (loop == 's') {
                    break;
                } else {
                    System.out.println("** Função inválida! **");
                }
            }

        }

        scan.close();
    }
}
