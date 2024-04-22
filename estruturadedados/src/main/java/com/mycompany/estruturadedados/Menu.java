/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturadedados;

import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {
        String tamanhoVetorInput = JOptionPane.showInputDialog("Digite o tamanho do vetor:");
        int tamanhoVetor = Integer.parseInt(tamanhoVetorInput);

        int[] vetor = new int[tamanhoVetor];
        StringBuilder elementosVetor = new StringBuilder("Digite os elementos do vetor:\n");

        for (int i = 0; i < tamanhoVetor; i++) {
            String elementoInput = JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + ":");
            vetor[i] = Integer.parseInt(elementoInput);
            elementosVetor.append(vetor[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, "Vetor Original:\n" + elementosVetor.toString());

        String[] opcoesOrdenacao = {"Ordenação por Inserção", "Ordenação por Seleção", "Ordenação Bolha"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha o método de ordenação:", "Método de Ordenação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesOrdenacao, opcoesOrdenacao[0]);

        MetodosOrdenacao.executarOrdenacao(vetor, escolha);
    }
}
