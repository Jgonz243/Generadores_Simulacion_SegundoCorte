package generadores;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jhon Gonzales
 */
public class Generador_Wichman {

    int X0, YO, Z0, iterador;

    public Generador_Wichman(int X0, int YO, int Z0, int iterador) {
        this.X0 = X0;
        this.YO = YO;
        this.Z0 = Z0;
        this.iterador = iterador;
    }

    public void evaluar(int X0, int Y0, int Z0, int iterador, DefaultListModel modelolista,DefaultListModel modelolista2,DefaultListModel modelolista3,DefaultListModel modelolista4) {
        int i = 0;
        while (i < iterador) {
            int X = (171 * X0) % 30269;
            int Y = (172 * Y0) % 30307;
            int Z = (170 * Z0) % 30323;

            float u = X / 30269 + Y0 / 30307 + Z / 30323;

            System.out.println("X: " + X + "Y: " + Y + "Z: " + Z);

            modelolista.add(modelolista.getSize(), X);
            modelolista2.add(modelolista2.getSize(), Y);
            modelolista3.add(modelolista3.getSize(), Z);
            modelolista4.add(modelolista4.getSize(), u);

            i++;
        }

    }

    public static void main(String[] args) {

    }

}
