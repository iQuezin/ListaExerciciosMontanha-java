class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 2500.0);

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário do funcionário: " + funcionario.getSalario());
    }
}