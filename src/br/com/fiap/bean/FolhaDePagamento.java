package br.com.fiap.bean;

public class FolhaDePagamento {
    //atributos
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoSaude;


    public double calcularSalarioLiquido() {

        double salarioLiquido = salarioBruto - ((descontoINSS/100) + (valorPlanoSaude * (numeroDeDependentes + 1)));
        return salarioLiquido;
    }
}
