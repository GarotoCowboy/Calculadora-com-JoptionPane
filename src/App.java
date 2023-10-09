// Faça um programa para ler dois valores inteiros 
// �
// A e 
// �
// B e imprima o resultado da expressão 
// (
// �
// +
// �
// )
// (A+B).

// Entrada
// A entrada consiste de duas linhas. A primeira linha contém o inteiro 
// �
// A e a segunda linha contém o inteiro 
// �
// B.

// Saída
// A saída consiste de uma linha contendo o resultado da expressão 
// (
// �
// +
// �
// )
// (A+B).

// Restrições
// Os inteiros fornecidos não terão valor absoluto maior que 1000.

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        CalculadoraSimples calc = new CalculadoraSimples();
        String[] opcao = {"soma", "subtração","multiplicação","divisao","sair"};
        int num = 0;
        while(num != 1 ){
       int condicao = JOptionPane.showOptionDialog(null, "Escolha uma operação", "calculadora",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null, opcao,opcao[0]);
        calc.pergunta();
       if(condicao == 0){
        calc.fazerSoma();
        JOptionPane.showMessageDialog(null, calc.getCalculo(), "resultado", condicao);

        }
        if(condicao == 1){
        calc.fazerSubtracao();
        JOptionPane.showMessageDialog(null, calc.getCalculo(), "resultado", condicao);

        }
        if(condicao == 2){
        calc.fazerMultiplicacao();
        JOptionPane.showMessageDialog(null, calc.getCalculo(), "resultado", condicao);


        }
        if(condicao == 3){
        calc.fazerDivisao();
        JOptionPane.showMessageDialog(null, calc.getCalculo(), "resultado", condicao);
        }
        if(condicao == 4){
            System.out.println("saindo...");
            num = 1;
        }
    }
}   
}
