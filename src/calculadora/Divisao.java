package calculadora;

/**
 * Classe responsável pela operação de divisão.
 */
public class Divisao {
    public int calcular(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero!");
        return a / b;
    }
}
