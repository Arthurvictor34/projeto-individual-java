public class Veiculos {
    private String modelo;
    private String marca;
    private int ano;
    private double valorAluguel;

    public Veiculos(String modelo, String marca, int ano, double valorAluguel) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valorAluguel = valorAluguel;
    }

    // Getters e Setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    public double getValorAluguel() { return valorAluguel; }
    public void setValorAluguel(double valorAluguel) { this.valorAluguel = valorAluguel; }
}
