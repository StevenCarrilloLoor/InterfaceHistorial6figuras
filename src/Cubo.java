public class Cubo extends Cuadrado{
    @Override
    public double calcularArea() {
        double area = 6 * Math.pow(l, 2);
        return area;
    }

    @Override
    public double CalcularPerimetro() {
        double perimetro = l * 12;
        return perimetro;
    }
    public double calcularVolumen() {
        double volumen = Math.pow(l, 3);
        return volumen;
    }
}
