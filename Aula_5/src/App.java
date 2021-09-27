import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Digite o nome: ");
        float salto = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo: "));
        char tipo = JOptionPane.showInputDialog("Digite o tipo: ").charAt(0);

        ContaCorrente conta1 = new ContaCorrente(name, salto, tipo);
        ContaCorrente conta2 = new ContaCorrente("João Ninguém", 100f, 0, 'K');

        conta1.depositar(30f);
        conta1.sacar(10f);

        JOptionPane.showMessageDialog(null,conta1.imprimiDados());

        // if simples
        if (conta1.saldo >= 30) {
            conta1.sacar(10f);
            JOptionPane.showMessageDialog(null,conta1.imprimiDados());
        }
        // if / else
        if (conta2.limite >= 30) {
            conta2.sacar(10f);
            JOptionPane.showMessageDialog(null,conta2.imprimiDados());
        }
        else{
            conta2.depositar(10f);
            JOptionPane.showMessageDialog(null,conta2.imprimiDados());
            
        }
    }
}
