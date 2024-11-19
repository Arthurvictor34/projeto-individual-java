public class Aluguel {
    private Veiculos veiculo;
    private Cliente cliente;
    private int dias;

    public Aluguel(Veiculos veiculo, Cliente cliente, int dias) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dias = dias;
    }

    public double calcularValorAluguel() {
        double valor = veiculo.getValorAluguel() * dias;
        if (cliente instanceof Funcionario) {
            Funcionario funcionario = (Funcionario) cliente;
            valor -= (valor * funcionario.getDesconto() / 100);
        }
        return valor;
    }

    // Getters e Setters
    public Veiculos getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculos veiculo) { this.veiculo = veiculo; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public int getDias() { return dias; }
    public void setDias(int dias) { this.dias = dias; }
}

