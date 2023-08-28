import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        Float n1 = teclado.nextFloat();

        System.out.print("Digite a segunda nota: ");
        Float n2 = teclado.nextFloat();

        System.out.print("Digite a terceira nota: ");
        Float n3 = teclado.nextFloat();

        System.out.print ("Digite a quarta nota: ");
        Float n4 = teclado.nextFloat();

        Float media = (n1 + n2 + n3 + n4) /4;

        System.out.printf("Sua média é %.1f", media);




    }
}