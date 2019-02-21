package br.luan;

public class SalarioDetalhe {

    private double salarioLiquido;
    private double irpf;

    public SalarioDetalhe(double salarioLiquido, double irpf) {
        this.salarioLiquido = salarioLiquido;
        this.irpf = irpf;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public double getIrpf() {
        return irpf;
    }

    @Override
    public String toString() {
        return "SalarioDetalhe{" +
                "salarioLiquido=" + salarioLiquido +
                ", irpf=" + irpf +
                '}';
    }
}
