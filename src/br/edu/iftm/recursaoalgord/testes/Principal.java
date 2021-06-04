package br.edu.iftm.recursaoalgord.testes;

import br.edu.iftm.recursaoalgord.classes.Ordenacao;
import br.edu.iftm.recursaoalgord.classes.Recursao;

public class Principal {
    public static void main(String[] args) {
        //System.out.println(Recursao.soma(4));
        //System.out.println(Recursao.fatorial(5));

        int[] vetor = {3,5,7,1,6,2,8,9,4,10};
        //Ordenacao.insertionSort(vetor);
        //Ordenacao.selectionSort(vetor);
        //Ordenacao.bubbleSort(vetor);
        //Ordenacao.quickSort(vetor, 0, vetor.length-1);
        Ordenacao.mergeSort(vetor,0,vetor.length-1);
        
        //imprenssão do vetor ordenado
        for (int i : vetor) {
            System.out.print(i+" ");
        }
        
        
    }
}
