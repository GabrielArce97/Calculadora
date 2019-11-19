package Model;

public class Operacion{
	
    double n1; //numero 1
    double n2; //numero 2
    double res; //resultado
    char tipo_operacion; //tipo de operación (+,-,*,/)

    
    public Operacion() {
		super();
	}

	public Operacion(double n1, double n2, char tipo_operacion) {
        this.n1 = n1;
        this.n2 = n2;
        this.tipo_operacion = tipo_operacion;
    }
    
    public double mostrarResultado(){
    	return this.res;
   }

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getRes() {
		return res;
	}

	public void setRes(double res) {
		this.res = res;
	}

	public char getTipo_operacion() {
		return tipo_operacion;
	}

	public void setTipo_operacion(char tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
	}
    
}

