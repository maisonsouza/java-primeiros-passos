
public class TesteIR2 {

	public static void main(String[] args) {
		 double salario = 3300.0;
		 if (salario <= 1903.98) {
			 System.out.println("Isento");
		 }else if (salario >= 1903.99 && salario <=2826.65) {
			 System.out.println("Aliquota 7%");
		 }else if (salario >= 2826.66 && salario<=3751.05) {
			 System.out.println("Aliquota de 15%");
		 }else if (salario>=3751.06 && salario<=46664.68) {
			 System.out.println("Aliquota de 22,5%");
		 }else {
			 System.out.println("Aliquota de 27,5%");
		 }

	}

}
