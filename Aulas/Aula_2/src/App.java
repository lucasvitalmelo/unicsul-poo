//importação de pacotes

import javax.swing.*; // pacote para construção de interface grafica

// entrada de dados pelo consolete
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Hello, World!");

        TesteTipos tst = new TesteTipos(); // Crio o objeto na memoria

        tst.setCodigo(25);
        tst.setEscolha(false);

        tst.letra = 'J'; //atribuiçao de valores
        tst.preco = (float) 14.99;

        System.out.println("objeto: " + tst);
        System.out.println("Codigo: " + tst.getCodigo() +
        "\nEscolha "+ tst.isEscolha() + "\nLetra: " + tst.getLetra()+
        "\npreco: "+ tst.getPreco() );

        Scanner leia = new Scanner(System.in); 
        // criado objeto leia do tipo scanner para entrada dos falores pelo console

        //Atribuiçao dos valores por meio do scanner
        System.out.println("Digite um valor para receber: ");

        tst.receber = Double.parseDouble(leia.nextLine());
        System.out.println("Digite um valor para idade: ");

        tst.idade = Byte.parseByte(leia.nextLine());
        System.out.println("Digite um valor para numero: ");

        tst.numero = Short.parseShort(leia.nextLine());
        System.out.println("Receber: " + tst.getReceber()+
        "\n idade" + tst.getIdade() + "\n numero: " + tst.getNumero());

        leia.close();

        //nextLine() metodo do scanner que lê e salva como string

        String valor = JOptionPane.showInputDialog("Digite o Codigo");
        tst.quantidade = Long.parseLong(valor);


    }
}
