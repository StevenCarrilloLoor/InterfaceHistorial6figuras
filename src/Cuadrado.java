import java.util.Scanner;

public class Cuadrado implements Figura{
    double l;
    @Override
    public double calcularArea() {
        double perimetro=l*4;
        return perimetro;
    }

    @Override
    public double CalcularPerimetro() {
        return Math.pow(l,2);
    }
    public void ingresarLado(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el lado del la figura: ");
        l = sc.nextDouble();
    }
}
