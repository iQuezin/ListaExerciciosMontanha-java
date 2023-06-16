public class TesteFuncionarioAprimorado {
    private String nome;
    private double salario;

    public TesteFuncionarioAprimorado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentualDeAumento) {
        double aumento = salario * (porcentualDeAumento / 100);
        salario += aumento;
    }

    public static void main(String[] args) {
        TesteFuncionarioAprimorado funcionario = new TesteFuncionarioAprimorado("João", 2500.0);

        double salarioAtual = funcionario.getSalario();
        System.out.println("Salário atual do funcionário: " + salarioAtual);

        funcionario.aumentarSalario(10);

        double novoSalario = funcionario.getSalario();
        System.out.println("Novo salário do funcionário: " + novoSalario);
    }
}
