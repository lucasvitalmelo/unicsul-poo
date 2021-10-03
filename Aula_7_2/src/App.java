import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int cont = 0;
        String conteudo = "Valores \n";
        do {
            JOptionPane.showMessageDialog(null,"O valor do contador é: " +cont);
            cont++;
        }while(cont < 10);
        do {
            conteudo+= "Número: " +cont+"\n";
            cont++;
        }while(cont < 10);

        JOptionPane.showMessageDialog(null, conteudo);
    }
}

