public class Jogador {
    String nome;
    int vida;
    int forca;

    public Jogador(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(Jogador outroJogador) {
        outroJogador.vida -= this.forca;
        System.out.println(this.nome + " atacou " + outroJogador.nome + " causando " + this.forca + " de dano.");
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
        System.out.println("Força: " + forca);
    }

    public static void main(String[] args) {
        Jogador j1 = new Jogador("Arqueiro", 100, 15);
        Jogador j2 = new Jogador("Guerreiro", 120, 10);

        System.out.println("Status inicial:");
        j1.mostrarStatus();
        j2.mostrarStatus();

        System.out.println("\nAtaque!");
        j1.atacar(j2);

        System.out.println("\nStatus após ataque:");
        j1.mostrarStatus();
        j2.mostrarStatus();
    }
}
