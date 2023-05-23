package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o tipo de opera��o (soma, divis�o, multiplica��o, subtra��o): ");
        String operacao = leia.nextLine();
        
        System.out.print("Digite um n�mero: ");
        int numero = leia.nextInt();
        
        System.out.print("Calcular at� o n�mero: ");
        int limite = leia.nextInt();
        
        System.out.println("Tabuada do " + numero + " (" + operacao + "):");
        
        for (int i = 1; i <= limite; i++) {
            int resultado;
            switch (operacao) {
                case "soma":
                    resultado = numero + i;
                    break;
                case "divis�o":
                    resultado = numero / i;
                    break;
                case "multiplica��o":
                    resultado = numero * i;
                    break;
                case "subtra��o":
                    resultado = numero - i;
                    break;
                default:
                    System.out.println("Opera��o inv�lida!");
                    leia.close();
                    return;
            }
            System.out.println(numero + " " + operacao + " " + i + " = " + resultado);
        }
        
        leia.close();
		

	}

}
