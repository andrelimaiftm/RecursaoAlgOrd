package br.edu.iftm.recursaoalgord.classes;

public class Recursao {

    public static int soma(int n){
        if(n==0){
            return 0;
        }
        return n+soma(n-1);
    }

    public static int fatorial(int n){
        if(n==1){
            return 1;
        }
        return n*fatorial(n-1);
    }    
}
