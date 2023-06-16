public class BombaDeCombustivel {
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaDeCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / valorLitro;
        if (litrosAbastecidos <= quantidadeCombustivel) {
            quantidadeCombustivel -= litrosAbastecidos;
            System.out.println("Abastecidos " + litrosAbastecidos + " litros de combustível.");
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
    }

    public void abastecerPorLitro(double litros) {
        double valorAPagar = litros * valorLitro;
        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Valor a ser pago: R$" + valorAPagar);
        } else {
            System.out.println("Não há combustível suficiente na bomba.");
        }
    }

    public void alterarValor(double novoValor) {
        valorLitro = novoValor;
        System.out.println("Valor do litro alterado para: R$" + novoValor);
    }

    public void alterarCombustivel(String novoCombustivel) {
        System.out.println("Tipo de combustível alterado para: " + novoCombustivel);
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        quantidadeCombustivel = novaQuantidade;
        System.out.println("Quantidade de combustível alterada para: " + novaQuantidade + " litros");
    }

}