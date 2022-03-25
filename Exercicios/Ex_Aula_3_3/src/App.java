import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("\n\n\n|-------------------------------------------|\n");
        System.out.print("|----------- Dados do Tringulo 1 -----------|\n");
        System.out.print("|-------------------------------------------|\n");
        
        System.out.print("\nDigite a base do trinagulo: ");
        float base = scan.nextFloat();

        System.out.print("Digite a altura do trinagulo: ");
        float altura = scan.nextFloat();
        
        System.out.print("\n|----------- Area do Tringulo ----------|\n\n");
        
        Triangulo t1 = new Triangulo(base, altura);
       
        float area = t1.calculaArea();

        String mensagem = t1.imprimeDados();
        
        System.out.println(mensagem);

        System.out.println("A area do trinagulo é " + area);

        // //============================================================================ 
        // //============================================================================ 

        Triangulo t2 = new Triangulo();

        System.out.print("\n\n|-------------------------------------------|\n");
        System.out.print("|----------- Dados do Tringulo 2 -----------|\n");
        System.out.print("|-------------------------------------------|\n");
        
        System.out.print("\nDigite a base do trinagulo: ");
        t2.base = scan.nextFloat();

        System.out.print("Digite a altura do trinagulo: "); 
        t2.altura = scan.nextFloat();
        
        System.out.print("\n|----------- Area do Tringulo -----------|\n\n");
               
        float area2 = t2.calculaArea();

        String mensagem2 = t2.imprimeDados();
        
        System.out.println(mensagem2);

        System.out.println("A area do trinagulo é " + area2);

        System.out.println("\n============================================================================");
        System.out.println("============================================================================");
        
        System.out.print("\n|------------------------------|\n");
        System.out.print("|----------- Data 1 -----------|\n");
        System.out.print("|------------------------------|\n");
        
        Data d1 = new Data();
        
        System.out.print("\nDigite o dia: ");
        d1.dia = scan.nextInt();
        
        System.out.print("Digite o mês: ");
        d1.mes = scan.nextInt();
        
        System.out.print("Digite o ano: ");
        d1.ano = scan.nextInt();
        
        d1.imprimeData();
        
        //============================================================================ 
        //============================================================================ 

        System.out.print("\n|------------------------------|\n");
        System.out.print("|----------- Data 2 -----------|\n");
        System.out.print("|------------------------------|\n");
        
        System.out.print("\nDigite o dia: ");
        int dia = scan.nextInt();
        
        System.out.print("Digite o mês: ");
        int mes = scan.nextInt();
        
        System.out.print("Digite o ano: ");
        int ano = scan.nextInt();
        
        Data d2 = new Data(dia, mes, ano);

        d2.imprimeData();

        scan.close();
    }
}
