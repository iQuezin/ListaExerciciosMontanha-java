public class Bola {
    private String cor;

    public Bola(String cor) {
        this.cor = cor;
    }

    public void trocaCor(String novaCor) {
        this.cor = novaCor;
    }

    public void mostraCor() {
        System.out.println("A cor da bola é: " + cor);
    }

}