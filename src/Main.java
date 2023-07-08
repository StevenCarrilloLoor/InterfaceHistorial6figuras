import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int llave = 1;
        List<Figura> listaFiguras = new ArrayList<>();
        List<String> listaCalculo = new ArrayList<>();
        while ( llave == 1){
            Scanner sc = new Scanner(System.in);

            System.out.println("Seleccione la figura:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Círculo");
            System.out.println("3. Triángulo");
            System.out.println("4. Pirámide");
            System.out.println("5. Cubo");
            System.out.println("6. Esfera");

            int opcion = sc.nextInt();
            Figura figura;

            switch (opcion) {
                case 1:
                    Cuadrado cuadrado = new Cuadrado();
                    cuadrado.ingresarLado();
                    figura = cuadrado;
                    listaFiguras.add(figura);
                    break;
                case 2:
                    Circulo circulo = new Circulo();
                    circulo.ingresarRadio();
                    figura = circulo;
                    listaFiguras.add(figura);
                    break;
                case 3:
                    Triangulo triangulo = new Triangulo();
                    triangulo.ingresoDeDatos();
                    figura = triangulo;
                    listaFiguras.add(figura);
                    break;
                case 4:
                    Piramide piramide = new Piramide();
                    piramide.ingresoDedatosPiramide();
                    figura = piramide;
                    listaFiguras.add(figura);
                    break;
                case 5:
                    Cubo cubo = new Cubo();
                    cubo.ingresarLado();
                    figura = cubo;
                    listaFiguras.add(figura);
                    break;
                case 6:
                    Esfera esfera = new Esfera();
                    esfera.ingresarRadio();
                    figura = esfera;
                    listaFiguras.add(figura);
                    break;
                default:
                    System.out.println("Opción inválida");
                    return;
            }

            System.out.println("Seleccione qué desea calcular:");
            System.out.println("1. Perímetro");
            System.out.println("2. Área");
            System.out.println("3. Volumen");

            int opcionCalcular = sc.nextInt();

            switch (opcionCalcular) {
                case 1:
                    double perimetro = figura.CalcularPerimetro();
                    System.out.println("El perímetro es: " + perimetro);
                    listaCalculo.add("Perimetro");
                break;
                case 2:
                    double area = figura.calcularArea();
                    System.out.println("El área es: " + area);
                    listaCalculo.add("Area");
                    break;
                case 3:
                    if (figura instanceof Cubo) {
                        Cubo cubo = (Cubo) figura;
                        double volumen = cubo.calcularVolumen();
                        System.out.println("El volumen es: " + volumen);
                        listaCalculo.add("Volumen");
                    } else if (figura instanceof Piramide) {
                        Piramide piramide = (Piramide) figura;
                        double volumen = piramide.calcularArea();
                        System.out.println("El volumen es: " + volumen);
                        listaCalculo.add("Volumen");
                    } else if (figura instanceof Esfera) {
                        Esfera esfera = (Esfera) figura;
                        double volumen = esfera.calcularVolumen();
                        listaCalculo.add("Volumen");
                        System.out.println("El volumen es: " + volumen);
                    } else {
                        System.out.println("Opción inválida");
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            System.out.println("Desea ver el historial de seleccion? 1=SI, 0=NO");
            int llave2 = sc.nextInt();
            if (llave2==1){
                for (int i = 0; i < listaFiguras.size(); i++) {
                    Figura figura2 = listaFiguras.get(i);
                    System.out.println("La figura numero " + (i + 1) + " escogida durante la ejecucion fue : " + figura2);
                }
                for (int i = 0;i<listaCalculo.size();i++){
                    String calculo = listaCalculo.get(i);
                    System.out.println("El calculo que se uso en la figura numero "+(i+1)+" fue el "+calculo);
                }
            }
            System.out.println("Desea seguir Calculando 1=SI, 0=NO");
            llave= sc.nextInt();
        }
    }
}
