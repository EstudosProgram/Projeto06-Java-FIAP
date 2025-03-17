package br.com.fiap.main;

import br.com.fiap.bean.ArCondicionado;
import br.com.fiap.bean.FolhaDePagamento;
import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        tv.canal = 5;
        tv.volume = 10;
        tv.mudarCanal(4);
        tv.diminuirVolume();

        System.out.printf("Volume atual: %d%nCanal atual: %d%n", tv.volume, tv.canal);

        ArCondicionado usar = new ArCondicionado();

        usar.temperatura = 20;
        usar.modo = "Resfriar";

        usar.diminuirTemperatura();
        usar.trocarModo("Ventilar");

        System.out.printf("Temperatura atual: %dºC%nModo: %s%n",usar.temperatura, usar.modo);

        FolhaDePagamento salario = new FolhaDePagamento();
        salario.salarioBruto = 2000.00;
        salario.numeroDeDependentes = 1;
        salario.valorPlanoSaude = 200.00;
        salario.descontoINSS = 10;
        salario.calcularSalarioLiquido();

        System.out.printf("Seu salário liquido é: R$ %.2f", salario.calcularSalarioLiquido());

    }
}
