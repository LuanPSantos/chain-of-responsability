package br.luan;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraSalarioLiquidoTest {

    @Test
    void deveCalcularAPrimeiraFaixa(){

        CalculadoraSalarioLiquido calculadora = new CalculadoraSalarioLiquido();

        SalarioDetalhe salarioDetalhe = calculadora.calcula(1500);

        Assertions.assertEquals(1500, salarioDetalhe.getSalarioLiquido());
        Assertions.assertEquals(0, salarioDetalhe.getIrpf());
    }

    @Test
    void deveCalcularASegundaFaixa(){

        CalculadoraSalarioLiquido calculadora = new CalculadoraSalarioLiquido();

        SalarioDetalhe salarioDetalhe = calculadora.calcula(2500);

        Assertions.assertEquals(2312.5, salarioDetalhe.getSalarioLiquido());
        Assertions.assertEquals(187.5, salarioDetalhe.getIrpf());
    }

    @Test
    void deveCalcularATerceiraFaixa(){

        CalculadoraSalarioLiquido calculadora = new CalculadoraSalarioLiquido();

        SalarioDetalhe salarioDetalhe = calculadora.calcula(3500);

        Assertions.assertEquals(2975, salarioDetalhe.getSalarioLiquido());
        Assertions.assertEquals(525, salarioDetalhe.getIrpf());
    }
}
