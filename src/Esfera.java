public class Esfera extends Circulo{
    @Override
    public double calcularArea() {
        double area = 4 * Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double CalcularPerimetro() {
        return 0;
    }
    public double calcularVolumen() {
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        return volumen;
    }
}
