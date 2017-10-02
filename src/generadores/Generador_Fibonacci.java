/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import java.util.ArrayList;

/**
 *
 * @author jhon Gonzales
 */
public class Generador_Fibonacci {

    int m, s, r, iterador;
    String o;
    indice N0, N1;
    ArrayList<indice> lista = new ArrayList();

    public Generador_Fibonacci(int N0, int N1, int m, int s, int r, String o, int iterador) {
        this.N0 = new indice("N", 0, N0);
        this.N1 = new indice("N", 1, N1);
        this.m = m;
        this.s = s;
        this.r = r;
        this.o = o;
        this.iterador = iterador;
        this.lista.add(this.N0);
        this.lista.add(this.N1);

    }

    public indice getIndice(int indice) {
        return lista.get(indice);

    }

    public void Generar_Serie() {
        int i=0;
        while(i<iterador){
        
        indice Nx = new indice("N", lista.size(), 0);
        indice indicea = getIndice(Nx.getSubindice() - s);
        indice indiceb = getIndice(Nx.getSubindice() - r);

        int resultado_operador = operador(indicea.getValor(), indiceb.getValor());
        Nx.setValor(resultado_operador % m);
        this.lista.add(Nx);
        System.out.println(Nx);
        i++;
        
        }

    }

    public int operador(int a, int b) {

        switch (o) {
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return a + b;
        }

    }
    
    

    public static void main(String[] args) {
        Generador_Fibonacci GF = new Generador_Fibonacci(13, 7, 9, 2, 1, "+", 5);
        GF.Generar_Serie();
    }

}
