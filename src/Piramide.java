import java.util.Scanner;

public class Piramide extends Triangulo{
    double altura;
    @Override
    public double calcularArea() {
        double areaBase = base * base;
        double areaLateral = base * Math.sqrt((altura * altura) + (base * base) / 4);
        double areaTotal = areaBase + areaLateral;
        return areaTotal;
    }

    @Override
    public double CalcularPerimetro() {
        return 0;
    }
    public void ingresoDedatosPiramide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de la base de la pirámide:");
        base = sc.nextDouble();

        System.out.println("Ingrese la altura de la pirámide:");
        altura = sc.nextDouble();
    }
    public double calcularVolumen() {
        double volumen = (base * base * altura) / 3;
        return volumen;
    }

}
