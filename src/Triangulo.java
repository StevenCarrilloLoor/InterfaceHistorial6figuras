import java.util.Scanner;

public class Triangulo implements Figura{
    double base,lado;

    @Override
    public double calcularArea() {
        double altura=Math.sqrt(Math.pow(lado,2)-Math.pow(base,2)/4);
        double area=(base*altura)/2;
        return area;

    }

    @Override
    public double CalcularPerimetro() {
        double perimetro=base*lado*2;
        return perimetro;
    }
    public void ingresoDeDatos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el lado del la figura: ");
        lado = sc.nextDouble();
        System.out.println("Ingrese la base del triangulo");
        base = sc.nextDouble();
    }
}
