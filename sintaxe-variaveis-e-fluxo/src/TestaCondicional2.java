
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais ");
		int idade = 16;
		boolean acompanhado = true;
		if (idade >= 18 || acompanhado) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}

	}

}
