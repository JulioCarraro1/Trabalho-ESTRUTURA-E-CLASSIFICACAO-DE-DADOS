package com.mycompany.estruturadedados;
import javax.swing.JOptionPane;

public class MetodosOrdenacao {

    public static void ordenarPorInsercao(int[] vetor) {
        long inicio = System.nanoTime();

        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }

        long fim = System.nanoTime();
        long tempoExecucao = fim - inicio;

        JOptionPane.showMessageDialog(null,
                "Vetor Ordenado usando Ordenação por Inserção (Tempo de Execução: " + tempoExecucao + " nanosegundos)\n"
                        + vetorToString(vetor));
    }

    public static void ordenarPorSelecao(int[] vetor) {
        long inicio = System.nanoTime();

        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = temp;
        }

        long fim = System.nanoTime();
        long tempoExecucao = fim - inicio;

        JOptionPane.showMessageDialog(null,
                "Vetor Ordenado usando Ordenação por Seleção (Tempo de Execução: " + tempoExecucao + " nanosegundos)\n"
                        + vetorToString(vetor));
    }

    public static void ordenarPorBolha(int[] vetor) {
        long inicio = System.nanoTime();

        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        long fim = System.nanoTime();
        long tempoExecucao = fim - inicio;

        JOptionPane.showMessageDialog(null,
                "Vetor Ordenado usando Ordenação Bolha (Tempo de Execução: " + tempoExecucao
                        + " nanosegundos)\n" + vetorToString(vetor));
    }

    public static void executarOrdenacao(int[] vetor, int escolha) {
        switch (escolha) {
            case 0:
                ordenarPorInsercao(vetor);
                break;
            case 1:
                ordenarPorSelecao(vetor);
                break;
            case 2:
                ordenarPorBolha(vetor);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
    }

    private static String vetorToString(int[] vetor) {
        StringBuilder sb = new StringBuilder();
        for (int num : vetor) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }
}
