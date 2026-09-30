import java.util.Scanner;

public class temp_water {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int contador = 0;

        while (contador < 12) {

            System.out.print("Me diz a temperatura ai " + (contador + 1) + ": ");
            double temperatura = sc.nextDouble();

            if (temperatura < 4 || temperatura > 10) {
                System.out.println("Calma la amigão a temperatura tem que ser entre 4 e 10 ºC");
            } else {
                soma += temperatura;
                contador++;
            }
        }

        double media = soma / 12;

        System.out.printf("A média de hoje das temperaturas é: %1f ºC%n", media);

        sc.close();
    }
}