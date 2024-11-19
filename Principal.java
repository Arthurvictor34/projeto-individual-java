import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Veiculos> veiculos = new ArrayList<>();
        veiculos.add(new Veiculos("Gol", "Volkswagen", 2015, 100.0));
        veiculos.add(new Veiculos("Civic", "Honda", 2018, 150.0));
        veiculos.add(new Veiculos("Corolla", "Toyota", 2020, 200.0));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do carro disponível:");
        String nomeCarro = scanner.nextLine();

        Veiculos veiculoEncontrado = null;
        for (Veiculos veiculo : veiculos) {
            if (veiculo.getModelo().equalsIgnoreCase(nomeCarro)) {
                veiculoEncontrado = veiculo;
                break;
            }
        }

        if (veiculoEncontrado != null) {
            System.out.println("Informações do veículo:");
            System.out.println("Modelo: " + veiculoEncontrado.getModelo());
            System.out.println("Marca: " + veiculoEncontrado.getMarca());
        }
    }
}
