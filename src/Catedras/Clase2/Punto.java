package src.Catedras.Clase2;

public class Punto {
    private double x,y;


    public Punto(double x1, double y1){
        this.x = x1;
        this.y = y1;
    }

    public Punto sumar(Punto p){
        return new Punto(this.x + p.x, this.y + p.y);
    }

    public Punto restar(Punto p){
        return new Punto(this.x + p.x, this.y + p.y);
    }

    public String toString(){
       return "("+this.x+","+this.y+")";
    }
}
