package lista11;

public class Exercicio06 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}