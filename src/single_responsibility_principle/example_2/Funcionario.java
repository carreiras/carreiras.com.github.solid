package single_responsibility_principle.example_2;

public class Funcionario {

    private String nome;
    private Cargo cargo;
    private Double salarioBase;

    public Cargo getCargo() {
        return cargo;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }
}
