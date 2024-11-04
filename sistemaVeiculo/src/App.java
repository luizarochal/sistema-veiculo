public class App {
    public static void main(String[] args) throws Exception {
        EmpresaTransporte empresa = new EmpresaTransporte();

        IVeiculo van1 = new Van(10.0, 100.0);
        IVeiculo van2 = new Van(20.0, 200.0);
        IVeiculo caminhao1 = new Caminhao(5000.0);

        empresa.addVeiculo(van1);
        empresa.addVeiculo(van2);
        empresa.addVeiculo(caminhao1);

        System.out.println(empresa.getCapTotal());
    }
}
