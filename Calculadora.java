
public class Calculadora {

	//Metodo de Soma
	void somar(int a, int b) {
		System.out.println("\nResultado: " + a + " + " + b + " = " + (a+b));
	}
	
	//Metodo de Subtração
	void subtrair(int a, int b) {
		System.out.println("\nResultado: " + a + " - " + b + " = " + (a-b));
	}

	//Metodo de Multiplicacao
	void multiplicar(int a, int b) {
		System.out.println("\nResultado: " + a + " * " + b + " = " + (a*b));
	}
	
	//Metodo de Divisão
	void dividir(int a, int b) {
		if (b != 0)
			System.out.println("\nResultado: " + a + " / " + b + " = " + (a/b));
		else
			System.out.println("Nenhum numero é divisivel por ZERO.");
	}
	
}
