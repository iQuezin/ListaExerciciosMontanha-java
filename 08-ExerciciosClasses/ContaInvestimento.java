class Investimento {
    private double saldo;
    private double taxaJuros;

    public Investimento(double saldoInicial, double taxaJuros) {
        this.saldo = saldoInicial;
        this.taxaJuros = taxaJuros;
    }

    public void adicioneJuros() {
        double juros = saldo * (taxaJuros / 100);
        saldo += juros;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
}

public class ContaInvestimento {
    public static void main(String[] args) {
        Investimento poupanca = new Investimento(1000.0, 10.0);

        System.out.println("Saldo inicial: R$" + poupanca.getSaldo());

        for (int i = 1; i <= 5; i++) {
            poupanca.adicioneJuros();
            System.out.println("Saldo após adicionar juros " + i + ": R$" + poupanca.getSaldo());
        }
    }
}
