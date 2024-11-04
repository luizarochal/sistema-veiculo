import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private List<IVeiculo> veiculos;
    
    public EmpresaTransporte() {
        this.veiculos = new ArrayList<>();
    }

    public void addVeiculo(IVeiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public double getCapTotal() {
        double capTotal = 0;
        for (IVeiculo veiculo : veiculos) {
            capTotal += veiculo.getCapCarga();
        }
        return capTotal;
    }
}
