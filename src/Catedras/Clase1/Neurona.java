package src.catedras.clase1;

public class Neurona {
	private double weight1,weight2;
	private double bias;

	// Constructor de la clase, no devuelve ningun valor, y tiene el mismo nombre que la clase
	public Neurona(double w1, double w2, double b){
		this.weight1 = w1;
		this.weight2 = w2;
		this.bias = b;
	}

	// Metodo que devuelve un doble
	public double computeZ(double input1, double input2){
		return input1 * weight1 +
		       input2 * weight2 +
		       bias;
	}

	// this <=> self

public double feed(double input1,double input2) {
	return bias;
}
}