public class Macaco {
    private String nome;
    private boolean buchoCheio;

    public Macaco(String nome) {
        this.nome = nome;
        this.buchoCheio = false;
    }

    public void comer() {
        if (!buchoCheio) {
            System.out.println(nome + " está comendo...");
            buchoCheio = true;
        } else {
            System.out.println(nome + " já está com o bucho cheio!");
        }
    }

    public void verBucho() {
        if (buchoCheio) {
            System.out.println(nome + " tem o bucho cheio.");
        } else {
            System.out.println(nome + " tem o bucho vazio.");
        }
    }

    public void digerir() {
        if (buchoCheio) {
            System.out.println(nome + " está digerindo...");
            buchoCheio = false;
        } else {
            System.out.println(nome + " não tem nada no bucho para digerir!");
        }
    }

}