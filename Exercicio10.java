package lista11;

public class Exercicio10 {
    public static void main(String[] args) {
        int qtdPrimos = 0;

        for (int num = 2; num <= 100; num++) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                qtdPrimos++;
            }
        }

        System.out.println("Quantidade de números primos entre 1 e 100: " + qtdPrimos);
    }
}