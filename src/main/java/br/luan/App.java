package br.luan;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        CalculadoraSalarioLiquido calculadora = new CalculadoraSalarioLiquido();

        SalarioDetalhe salarioDetalhe = calculadora.calcula(5000);

        System.out.println(salarioDetalhe);

    }
}
