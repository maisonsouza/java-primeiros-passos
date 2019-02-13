
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais ");
		int idade = 16;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Você tem amis de 18 anos");
			System.out.println("Seja bem vindo!");
		} else if(quantidadePessoas >=2){
			System.out.println("Infelizmente você não tem 18, mas pode entrar acompanhado");
		}else {
			System.out.println("Infelizmente você não pode entrar");
		}
			
		

	}

}
