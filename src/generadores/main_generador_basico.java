package generadores;


import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhon Gonzales
 */
public class main_generador_basico {
     
    public static void main(String[] args) {
   
    ScriptEngineManager manager = new ScriptEngineManager(); 
    ScriptEngine interprete = manager.getEngineByName("js"); 
    try { 
      String formula = "(X+2)/Math.pow(X, 2);"; 
      interprete.put("X", 2); 

              
      String formula2 = "X/G"; 
      interprete.put("G", 33); 

      System.out.println("Resultado = "+interprete.eval(formula)); 
      System.out.println("Resultado = "+interprete.eval(formula2)); 
          
      
    } catch(ScriptException se) { 
      se.printStackTrace(); 
    } 
  } 
}