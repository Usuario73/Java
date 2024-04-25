

public class Calculadora {
    
    public static double adicionar(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return Double.NaN; // Retornando NaN (Not a Number) para indicar um valor não definido
        } else {
            return num1 / num2;
        }
    }
    
    public static void main(String[] args) {
        // Exemplo de uso:
        System.out.println("Adição: " + Calculadora.adicionar(5, 3));
        System.out.println("Subtração: " + Calculadora.subtrair(5, 3));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(5, 3));
        System.out.println("Divisão: " + Calculadora.dividir(5, 0)); // Tentativa de divisão por zero
    }
}
