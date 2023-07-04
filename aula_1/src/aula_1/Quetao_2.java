package aula_1;

import java.util.Scanner;

public class Quetao_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int alunos = 0;
		int alunas = 0;
		int num = 0;
		
			Scanner lerNum = new Scanner (System.in);
		
		System.out.println("Digite a Quantidade de alunos");
			 alunos = lerNum.nextInt();
		System.out.println("Digite a Quantidade de alunas");
			 alunas = lerNum.nextInt();
			
			 System.out.println("A Quantidades de Alunas é:" + alunas);
			 System.out.println("A Quantidades de Alunos é:" + alunos);

	}

}
