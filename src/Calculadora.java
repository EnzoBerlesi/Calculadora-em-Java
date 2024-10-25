
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora do Enzão(em java)!!!!!");
        System.out.println("Por favor digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite a operação que voc~e deja realizar (+,-,*,/)");
        char operador = scanner.next().charAt(0);

        System.out.println("Digite agora o segundo número por favor");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Aqui não divide por 0 patrão");
                    return;
                }
                break;

            default:
                System.out.println("Operador Inválido!!");
        }

        System.out.println("Resultado: " + resultado);
        System.out.println("Selo enzao de qualidade!");
    }
}