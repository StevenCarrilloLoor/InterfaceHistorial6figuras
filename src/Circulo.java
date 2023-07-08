import java.util.Scanner;

public class Circulo implements Figura {
    double radio;
    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double CalcularPerimetro() {
        double perimetro= 2*Math.PI*radio;
        return perimetro;
    }
    public void ingresarRadio(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio = sc.nextDouble();
    }
}
