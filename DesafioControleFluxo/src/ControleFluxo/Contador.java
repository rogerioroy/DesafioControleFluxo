package ControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro par�metro");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo par�metro");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo par�metro deve ser maior que o primeiro");
		}
		sc.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {	
		if (parametroUm>parametroDois || parametroUm==parametroDois) {
			throw new ParametrosInvalidosException();
		}else{
			int contagem = parametroDois - parametroUm;
			for (int x = 1; x<=contagem ; x++) {
				System.out.println("Imprimindo o n�mero: " + x);
			}
		}
	}
		
}
