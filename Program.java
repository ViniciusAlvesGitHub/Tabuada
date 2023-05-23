package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o tipo de operação (soma, divisão, multiplicação, subtração): ");
        String operacao = leia.nextLine();
        
        System.out.print("Digite um número: ");
        int numero = leia.nextInt();
        
        System.out.print("Calcular até o número: ");
        int limite = leia.nextInt();
        
        System.out.println("Tabuada do " + numero + " (" + operacao + "):");
        
        for (int i = 1; i <= limite; i++) {
            int resultado;
            switch (operacao) {
                case "soma":
                    resultado = numero + i;
                    break;
                case "divisão":
                    resultado = numero / i;
                    break;
                case "multiplicação":
                    resultado = numero * i;
                    break;
                case "subtração":
                    resultado = numero - i;
                    break;
                default:
                    System.out.println("Operação inválida!");
                    leia.close();
                    return;
            }
            System.out.println(numero + " " + operacao + " " + i + " = " + resultado);
        }
        
        leia.close();
		

	}

}
