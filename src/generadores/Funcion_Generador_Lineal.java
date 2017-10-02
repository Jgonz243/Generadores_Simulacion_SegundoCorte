/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import javax.swing.DefaultListModel;

/**
 *
 * @author jhon Gonzales
 */
public class Funcion_Generador_Lineal {
    
float semilla,m;
int a,b,iteraciones;
       public float u;
    
    Funcion_Generador_Lineal(float semilla,int a,int b,float m,int iteraciones){
        this.semilla=semilla;
        this.a=a;
        this.b=b;
        this.m=m;
        this.iteraciones=iteraciones;
        
       
      }
    public void evaluar(float semilla,int a,int b,float m,int iteraciones, DefaultListModel modelolista,DefaultListModel modelolista2){
  
        int contador=0;
        while(contador<iteraciones){
            contador++;
            float funcion = 0;            
            funcion=a*semilla+1;
            float funcion2=funcion%m;
            semilla=funcion2;            
                  float u=0;
            u=semilla/m;
             System.out.println("X= "+ semilla);
             System.out.println("U="+ u);
             int s=(int) semilla;
          
          modelolista.add(modelolista.getSize(), s);
          modelolista2.add(modelolista2.getSize(), u);
        }
        
       
    }
     
    
   
      
     
    }
        
      