public class App {
    public static void main(String[] args) throws Exception {
        Cliente c = new Cliente();
        Curso cT = new Curso();

        c.id = 0001;
        c.name = "Maicon Jacqueson";
        c.document = "12.345.678-90";

        cT.id = 5000;
        cT.name = "Yoga";

        System.out.println("");
        System.out.println("id: " + c.id);
        System.out.println("Nome: " + c.name);
        System.out.println("Documento: " + c.document);
        System.out.println("");
        System.out.println("Número: " + cT.id);
        System.out.println("Nome: " + cT.name);
    }
}