public class Lampada {
    String cor;
    boolean ligada;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    public static void main(String[] args) {
        Lampada lamp = new Lampada();
        lamp.cor = "Branca";

        lamp.mostrarEstado();
        lamp.ligar();
        lamp.mostrarEstado();
        lamp.desligar();
        lamp.mostrarEstado();
    }
}
