package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        FolhaDePagamento salario2 = new FolhaDePagamento();
        double salarioBruto,descontoINSS,valorPlanoSaude;
        int numeroDeDependentes;
        String scan;

        scan = JOptionPane.showInputDialog("Digite o salário bruto");
        salario2.salarioBruto = Double.parseDouble(scan);
        scan = JOptionPane.showInputDialog("Digite o desconto do INSS");
        salario2.descontoINSS = Double.parseDouble(scan);
        scan = JOptionPane.showInputDialog("Digite o valor do plano de saúde");
        salario2.valorPlanoSaude = Double.parseDouble(scan);
        scan = JOptionPane.showInputDialog("Digite o número de dependentes do plano de saúde");
        salario2.numeroDeDependentes = Integer.parseInt(scan);

        JOptionPane.showMessageDialog(null, "Salário líquido: " + salario2.calcularSalarioLiquido());





    }
}
