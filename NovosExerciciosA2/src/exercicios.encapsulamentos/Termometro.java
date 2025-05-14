public class Termometro {
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        if (temperatura >= -273.15) {
            this.temperatura = temperatura;
        }
    }
}