package generadores;


import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Funciones_Generador_Basico {
    
ScriptEngineManager manager = new ScriptEngineManager(); 
    ScriptEngine interprete = manager.getEngineByName("js"); 
    String funcion;
  
    Funciones_Generador_Basico(String funcion){
        this.funcion=funcion;

    }
   
    public double evaluar(double numero){
        
        try {
            interprete.put("X", numero);
            double resultado= (double) interprete.eval(this.funcion);
            return resultado;   
        } catch (ScriptException ex) {
            Logger.getLogger(Funciones_Generador_Basico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
   
      
     
    }
        
      
            
        
    