/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_201503723;

/**
 *
 * @author Bryan
 */
public class Matriz {
    String [][] matrizminas;
    String [][] matrizjuego;
    int fila, columna, mina;
    public void Matriz(int nivel){
        if(nivel==1){
            fila = 4;
            columna = 4;
            mina=4;
        }
        else if(nivel==2){
            fila =6;
            columna=6;
            mina=8;
        }
        else if(nivel ==3){
            fila = 8;
            columna = 8;
            mina = 12;
        }
        
    }
    public void ConstruirMatriz(int fila, int columna){
         matrizminas=new String[fila][columna];
         matrizjuego=new String[fila][columna];
        }
    
    
}
