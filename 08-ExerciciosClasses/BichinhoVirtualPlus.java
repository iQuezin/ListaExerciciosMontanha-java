public class BichinhoVirtualPlus {
    private String nome;
    private int fome;
    private int saude;
    private int idade;
    private int tedio;

    public BichinhoVirtualPlus(String nome, int fome, int saude, int idade, int tedio) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
        this.tedio = tedio;

    }

    public String toString() {
        return "Nome: " + nome +
                "\nFome: " + fome +
                "\nSaúde: " + saude +
                "\nIdade: " + idade +
                "\nTédio: " + tedio;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alimentar(int quantidadeComida) {
        fome -= quantidadeComida;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void brincar(int tempoBrincadeira) {
        tedio -= tempoBrincadeira;
        if (tedio < 0) {
            tedio = 0;
        }
    }

    public void envelhecer() {
        idade++;
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarFome() {
        return fome;
    }

    public int retornarSaude() {
        return saude;
    }

    public int retornarIdade() {
        return idade;
    }

    public int retornarTedio() {
        return tedio;
    }

    public void alterarFome(int novaFome) {
        fome = novaFome;
    }

    public void alterarTedio(int novoTedio) {
        tedio = novoTedio;
    }

    public String retornarHumor() {
        if (fome <= 5 && saude >= 7 && tedio <= 3) {
            return "Feliz";
        } else if (fome > 5 && saude < 7 && tedio > 3) {
            return "Triste";
        } else {
            return "Neutro";
        }
    }
}
