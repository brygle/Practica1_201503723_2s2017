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
            fila = 6;
            columna = 6;
            mina=4;
        }
        else if(nivel==2){
            fila =8;
            columna=8;
            mina=8;
        }
        else if(nivel ==3){
            fila = 10;
            columna = 10;
            mina = 12;
        }
        ConstruirMatriz(fila, columna);
        AsignarMinas(mina);
        ImprimirMatrizMinas();
        System.out.println("");
        AsignarMatrizJuego();
        ImprimirMatrizJuego();
        Voltear(1,2);
        System.out.println("");
        Voltear(2,4);
        ImprimirMatrizJuego();
        NumeroMinasCercanas();
        System.out.println("");
        ImprimirMatrizMinas();
        System.out.println("");
        Voltear(1,2);
        Voltear(2,4);
        Voltear(1,1);
        System.out.println("");
        ImprimirMatrizJuego();
    }
    public void ConstruirMatriz(int fila, int columna){
         matrizminas=new String[fila][columna];
         matrizjuego=new String[fila][columna];
        }
    
    public void AsignarMinas(int mina){
        int i;
        int filarandom, columnarandom;
        for(i=1;i<=mina;i++){
            do{
            filarandom = (int)((Math.random())*fila);
            columnarandom = (int)((Math.random())*columna);
        }while((matrizminas[filarandom][columnarandom]!=null)||((filarandom==0)||(filarandom==fila-1)||(columnarandom==0)||(columnarandom==columna-1)));
           matrizminas[filarandom][columnarandom]="[M] "; 
    }
        
}
    
    public void ImprimirMatrizMinas(){
        int i;
        int j;
        
        for(i=1;i<fila-1;i++){
            for(j=1;j<columna-1;j++){
                if(matrizminas[i][j]==null){
                    System.out.print("[ ] " );
                }
                else{
                    System.out.print(matrizminas[i][j]);
                }
            
            }
            System.out.println("");
        
        }
    
    }

    public void AsignarMatrizJuego(){
    int i, j;
        for(i=1;i<fila-1;i++){
            for(j=1;j<columna-1;j++){
                matrizjuego[i][j]="[X] ";
            }
        
        }
    
    }
    
    public void ImprimirMatrizJuego(){
        int i, j;
        for(i=1;i<fila-1;i++){
            for(j=1;j<columna-1;j++){
                System.out.print(matrizjuego[i][j]);
            }
            System.out.println("");
        }
    }
    public void Voltear(int x, int y){
        int filamod = x ;
        int columnamod=y ;
        matrizjuego[filamod][columnamod] = matrizminas[filamod][columnamod];
    }
    
    public void NumeroMinasCercanas(){
       int i, j, k , m, cont=0;
       int f=fila;
       int c= columna;
       for(i=0+1;i<(f-1);i++){
           for(j=0+1;j<(c-1);j++){
               cont=0;
               if(matrizminas[i][j]==null){
                   for(k=i-1;k<=i+1;k++){
                       for(m=j-1;m<=j+1;m++){
                           if((i!=k) || (j!=m)){
                                if((matrizminas[k][m]!=null)){
                                    if(matrizminas[k][m].equalsIgnoreCase("[M] ")){
                                        cont++;
                                    }
                                }
                           }
                           
                       }
                   }
                matrizminas[i][j] = "["+cont+"] ";
                
               }
               
           
           }
       }
    }
}



