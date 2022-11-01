package atividade1;

import javax.swing.*;

public class VetorMedia {
    // Calcule a média das notas que o usuário necessita
    public static void main(String[] args) {

        String qtdNotasString = JOptionPane.showInputDialog("Quantas notas possuem");
        int qtdNotas = Integer.parseInt(qtdNotasString);

        double[] notas = new double[qtdNotas];

        for(int i=0; i<qtdNotas;i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota nº "+i));
        }
        double soma=0;
        for (int i = 0; i < qtdNotas; i++) {
            soma+=notas[i];
        }

        JOptionPane.showMessageDialog(null,"A média é: "+(soma/qtdNotas));

    }
}
