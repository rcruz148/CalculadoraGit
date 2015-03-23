import java.io.IOException;


public class InterfaceCalculadora {

	Calculadora c = new Calculadora();
	
	void somar() throws IOException {
		System.out.println("Soma:");
		System.out.println("Insira o valor A:");
		int a = System.in.read();
		System.out.println("Insira o valor B:");
		int b = System.in.read();
		c.somar(a, b);
	}
}
