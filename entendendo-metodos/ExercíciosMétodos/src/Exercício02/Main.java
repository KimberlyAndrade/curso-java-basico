package Exercício02;


public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Exercício Quadrilátero");
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado é: " + areaQuadrado);
        double areaRetangulo = Quadrilatero.area(5d, 8d);
        System.out.println("Area do retangulo é: " + areaRetangulo);
        double areaTrapezio = Quadrilatero.area(7, 6, 9);
        System.out.println("Area do trapezio é: " + areaTrapezio);
        

    }
}
