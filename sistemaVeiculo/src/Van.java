public class Van implements IVeiculo {
    private double volume;
    private double pesoMax;

    public Van(double volume, double pesoMax) {
        this.volume = volume;
        this.pesoMax = pesoMax;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getPesoMax(){
        return this.pesoMax;
    }

    @Override
    public double getCapCarga() {
        return volume * pesoMax;
    }

}
