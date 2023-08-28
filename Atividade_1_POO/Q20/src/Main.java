import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        Double valorHora = teclado.nextDouble();

        System.out.println("Quantas horas você trabalha por mês?");
        Double horaMes = teclado.nextDouble();

        Double bruto = valorHora * horaMes;

//        Descontos
        Double ir = bruto * 0.11;
        Double inss = bruto * 0.08;
        Double sindicato = bruto * 0.05;
        Double descontos = ir + inss + sindicato;

//        Cáuculo do Salário líquido
        Double liquido = bruto - descontos;

        System.out.printf("Salário Bruto: R$ %.2f\n" , bruto);
        System.out.printf("Imposto de Renda: R$ %.2f\n" ,ir);
        System.out.printf("Sindicato: R$ %.2f\n" , sindicato);
        System.out.printf("INSS: R$ %.2f\n",inss);
        System.out.printf("Sálario Líquido: R$ %.2f" ,liquido);


    }
}