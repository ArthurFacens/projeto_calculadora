import calculadora.Calculadora;


public class TesteCalculadora {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        System.out.println("Soma: " + c.calc(10, 5, "+"));
        System.out.println("Subtração: " + c.calc(10, 5, "-"));
        System.out.println("Multiplicação: " + c.calc(10, 5, "*"));
        System.out.println("Divisão: " + c.calc(10, 5, "/"));

        System.out.println("Divisão por zero: " + c.calc(10, 0, "/"));
        System.out.println("Operação inválida: " + c.calc(4, 4, "%"));
    }
}

