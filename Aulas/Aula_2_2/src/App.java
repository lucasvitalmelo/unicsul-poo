import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String value1, value2;
        int n1, n2;

        value1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
        value2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        n1 = Integer.parseInt(value1);
        n2 = Integer.parseInt(value2);

        JOptionPane.showMessageDialog(null, n1 + "x" + n2 + "=" + n1 * n2);
    }
}
