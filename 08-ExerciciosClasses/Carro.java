public class Carro {
    private double consumoCombustivel;
    private double nivelCombustivel;

    public Carro(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        this.nivelCombustivel = 0;
    }

    public void andar(double distancia) {
        double combustivelConsumido = distancia / this.consumoCombustivel;
        this.nivelCombustivel -= combustivelConsumido;
    }

    public double obterGasolina() {
        return this.nivelCombustivel;
    }

    public void adicionarGasolina(double quantidade) {
        this.nivelCombustivel += quantidade;
    }

    public static void main(String[] args) {
        Carro meuFusca = new Carro(15);
        meuFusca.adicionarGasolina(20);
        meuFusca.andar(100);
        System.out.println("Combustível restante: " + meuFusca.obterGasolina() + " litros");
    }
}