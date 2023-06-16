public class BichinhoVirtual {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public BichinhoVirtual(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarFome(int fome) {
        this.fome = fome;
    }

    public void alterarSaude(int saude) {
        this.saude = saude;
    }

    public void alterarIdade(int idade) {
        this.idade = idade;
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

    public String retornarHumor() {
        if (fome <= 5 && saude >= 7) {
            return "Feliz";
        } else if (fome > 5 && saude < 7) {
            return "Triste";
        } else {
            return "Neutro";
        }
    }
}