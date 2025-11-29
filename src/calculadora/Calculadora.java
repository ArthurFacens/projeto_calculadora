package calculadora;

/**
 * Classe Calculadora responsável por centralizar operações matemáticas.
 * Refatorada para uso de classes especializadas.
 */
public class Calculadora {

    public int r;

    public int calc(int a, int b, String op) {

        switch (op) {
            case "+":
                r = new Soma().calcular(a, b);
                break;

            case "-":
                r = new Subtracao().calcular(a, b);
                break;

            case "*":
                r = new Multiplicacao().calcular(a, b);
                break;

            case "/":
                try {
                    r = new Divisao().calcular(a, b);
                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                    return 0;
                }
                break;

            default:
                System.out.println("Operação inválida!");
                return 0;
        }

        return r;
    }
}

