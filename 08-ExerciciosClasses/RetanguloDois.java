class RetanguloDois {
    private Ponto pontoInicial;
    private int largura;
    private int altura;

    public RetanguloDois(Ponto pontoInicial, int largura, int altura) {
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
    }

    public Ponto getCentro() {
        int centroX = pontoInicial.getX() + largura / 2;
        int centroY = pontoInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }

    public void alterarRetangulo(Ponto pontoInicial, int largura, int altura) {
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
    }
}
