/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

/**
 *
 * @author jhon Gonzales
 */
public class indice {
    
    String letra;
    int subindice;
    int valor;

    public indice(String letra, int subindice, int valor) {
        this.letra = letra;
        this.subindice = subindice;
        this.valor = valor;
    }

    public String getLetra() {
        return letra;
    }

   

    public int getSubindice() {
        return subindice;
    }

   

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    @Override
    public String toString(){
    return letra+subindice+": "+valor;
    }
    
    
    
    
}
