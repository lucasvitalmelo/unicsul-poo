public class App {
    public static void main(String[] args) throws Exception {
        Paciente paciente1 = new Paciente("Jessica");
        Paciente paciente2 = new Paciente("");
        System.out.println("Hello, World!");

        paciente1.datanascimento = "11/12/1988";
        paciente1.endereco = "R lalala. jaja - sp";
        paciente1.rg = "3123123";
        paciente1.telefone = "11232334";
        paciente1.profissao = "sei la";

        paciente2.setNome("Marcelo");
        paciente2.setDatanascimento("19/08/1998");
        paciente2.setEdereco("12312323");
        paciente2.setRg("123423434");
        paciente2.setTelefone("11232334");
        paciente2.setProfissao("Vai saber");
    }
}
