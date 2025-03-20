package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FolhaDePagamento salario1 = new FolhaDePagamento();

         double salarioBruto;
         int numeroDeDependentes;
         double descontoINSS;
         double valorPlanoSaude;

        System.out.println("Digite o salário bruto:");
        salario1.salarioBruto = scan.nextDouble();
        System.out.println("Digite o desconto do INSS:");
        salario1.descontoINSS = scan.nextDouble();
        System.out.println("Digite o valor do plano de saúde:");
        salario1.valorPlanoSaude = scan.nextDouble();
        System.out.println("Digite o número de dependentes do plano de saúde:");
        salario1.numeroDeDependentes = scan.nextInt();

        System.out.printf("Seu salário liquido é: R$ %.2f", salario1.calcularSalarioLiquido());
    }





}
