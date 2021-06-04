package br.edu.iftm.recursaoalgord.classes;

public class Ordenacao {

    //algoritmo de inserção
    public static void insertionSort(int[] vet){
        int i,j,chave = 0;
        for (i = 1; i < vet.length; i++) {
            chave = vet[i];
            j = i-1;
            //vet[0] = x;
            while( (j > -1) && (chave < vet[j])){
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = chave;
        }
    }

    public static void selectionSort(int[] vet){
        int i,j,min,chave = 0;
        for(i=0; i<= vet.length-1; i++){
            min = i;
            for(j=i+1; j <= vet.length-1; j++){
                if(vet[j] < vet[min]){
                    min = j;
                }
            }
            chave = vet[min];
            vet[min] = vet[i];
            vet[i] = chave;
        }

    }

    public static void bubbleSort(int[] vet){
        int i,j,chave = 0;
        int tam =  vet.length-1;        
        for (i = 0; i < tam; i++) {
            for (j = tam; j > i; j--) {
                if(vet[j] < vet[i]){
                    chave = vet[i];
                    vet[i] = vet[j];
                    vet[j] = chave;
                }
            }
        }
    }

    public static void quickSort(int[] vet, int esq, int dir){
        int pivo = esq, i, chave, j =0;
        //partição
        for(i=esq+1; i<=dir; i++){
            j=i;
            if(vet[j] < vet[pivo]){
                chave = vet[j];
                while(j > pivo){
                    vet[j] = vet[j-1];
                    j--;
                }
                vet[j] = chave;
                pivo++;
            }
        }
        if(pivo-1 >= esq){
            quickSort(vet, esq, pivo-1);
        }
        if(pivo+1 <= dir){
            quickSort(vet, pivo+1, dir);
        }
    }

    //GitHub: HenriqueIni
    //https://www.blogcyberini.com/
    public static void mergeSort(int vet[], int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim) / 2; //calcula o meio
            mergeSort(vet, inicio, meio); //ordena do subvetor esquerdo
            mergeSort(vet, meio + 1, fim); //ordena do subvetor direito
            merge(vet, inicio, meio, fim); //funde os subvetores esquerdo e direito
        }
    }    
    private static void merge(int vet[], int inicio,
     int meio, int fim){
        int tamEsq = meio - inicio + 1; //tamanho do subvetor esquerdo
        int tamDir = fim - meio; //tamanho do subvetor direito
        int esq[] = new int[tamEsq]; //subvetor auxiliar esquerdo
        int dir[] = new int[tamDir]; //subvetor auxiliar direito
        int idxEsq = 0; //índice do subvetor auxiliar esquerdo
        int idxDir = 0; //índice do subvetor auxiliar direito
        
        //Copia os elementos do subvetor esquerdo para o vetor auxiliar
        for(int i = 0; i < tamEsq; i++){
            esq[i] = vet[inicio + i];
        }
        //Copia os elementos do subvetor direito para o vetor auxiliar
        for(int j = 0; j < tamDir; j++){
            dir[j] = vet[meio + 1 + j];
        }
        
        //intercala os subvetores
        for(int k = inicio; k <= fim; k++){
            if(idxEsq < tamEsq){
                if(idxDir < tamDir){
                    if(esq[idxEsq] < dir[idxDir]){
                        vet[k] = esq[idxEsq++];
                    }else{
                        vet[k] = dir[idxDir++];
                    }
                }else{
                    vet[k] = esq[idxEsq++];
                }
            }else{
                vet[k] = dir[idxDir++];
            }
        }
    }
    
}
