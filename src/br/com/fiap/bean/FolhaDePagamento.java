package br.com.fiap.bean;

public class FolhaDePagamento {
    //atributos
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoSaude;


    public double calcularSalarioLiquido() {

        double desconto1, desconto2, salarioLiquido;
        desconto1 = salarioBruto * (descontoINSS / 100);
        desconto2 = valorPlanoSaude * (numeroDeDependentes + 1);
        salarioLiquido = salarioBruto - (desconto1 + desconto2);

        return salarioLiquido;
    }
}
