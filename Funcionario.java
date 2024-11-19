public class Funcionario extends Cliente {
    private String matricula;
    private double desconto;

    public Funcionario(String nome, String cpf, String matricula, double desconto) {
        super(nome, cpf);
        this.matricula = matricula;
        this.desconto = desconto;
    }

    // Getters e Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public double getDesconto() { return desconto; }
    public void setDesconto(double desconto) { this.desconto = desconto; }
}
