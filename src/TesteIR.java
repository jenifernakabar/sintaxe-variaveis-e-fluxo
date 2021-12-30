
public class TesteIR {

	public static void main(String[] args) {
		
		double salario = 5000.0;
		
		if (salario <= 2800.0) {
			System.out.println("deduzir 142,00");
			}
		
		if (salario > 2800.01 && salario <= 3751.0) {
			System.out.println("deduzir 350,00");
		}
		
		if (salario > 3751.01 && salario <= 4664.00) {
			System.out.println("deduzir 636,00");
			
		}
	}

}
