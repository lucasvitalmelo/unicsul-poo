import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> alergicosAbacaxiVinho = new ArrayList<String>();
        ArrayList<String> alergicosLeiteConsesado = new ArrayList<String>();

        Sorvete sorvete01 = new Sorvete();

        sorvete01.setId(1);
        sorvete01.setNome("Abacaxi ao Vinho");
        sorvete01.setDescricaoIngr("Leite, abacaxi, vinho");
        sorvete01.setDataFab("10/10/2021");
        sorvete01.setDataVal("25/04/2022");
        sorvete01.setQuantidade(20);
        sorvete01.setTipo("pote");
        alergicosAbacaxiVinho.add("Glutem");
        alergicosAbacaxiVinho.add("Lactose");
        sorvete01.setAlergicos(alergicosAbacaxiVinho);

        sorvete01.atualizarQuantidade("palito", 13);
        sorvete01.imprimir();
        sorvete01.listaAlergicos();
        boolean sorvete01Vencido = sorvete01.vencimento("11/03/2022");
        if (sorvete01Vencido) {
            System.out.println("Vencido!");
        }

        alergicosLeiteConsesado.add("Lactose");
        Sorvete sorvete02 = new Sorvete(2, "Leite Condesado", "Creme de leite, Açucar", "05/10/2021", "20/04/2022",
                1000, "bola", alergicosLeiteConsesado);

        sorvete02.atualizarQuantidade("bola", 5);

        sorvete02.imprimir();
        sorvete02.listaAlergicos();
        boolean sorvete02Vencido = sorvete02.vencimento("20/04/2022");
        if (sorvete02Vencido) {
            System.out.println("Vencido!");
        }

    }
}
