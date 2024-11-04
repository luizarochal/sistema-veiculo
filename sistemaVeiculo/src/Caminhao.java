public class Caminhao implements IVeiculo {
    private double capCarga;

    public Caminhao(double capCarga) {
        this.capCarga = capCarga;
    }

    @Override
    public double getCapCarga(){
        return capCarga;
    }
}
