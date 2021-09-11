package src.catedras.clase2;

public class PuntoMain {
    public static void main(String args[]) {

        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(2, 2);

        Punto p3 = p1.sumar(p2);

        System.out.println(p3.toString());

        // Esto igual sirve, si hay un metodo llamado "toString" en una clase, Java al imprimir
        // lo ocupa solo
        System.out.println(p3);
        
    }
}
