public class Quadrado {
    private double lado;

    public void setLado(double novoLado) {
        if (novoLado > 0) {
            this.lado = novoLado;
        } else {
            System.out.println("O lado do quadrado deve ser maior que zero.");
        }
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}