/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina_numero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author compu
 */
public class client {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static int main(String[] args, int nale) throws IOException{
        
          Socket client = null;
        BufferedReader entrada, texto;
        PrintStream salida;
        InputStreamReader e;
        String mensaje, enviado;
        
     
       
             e = new InputStreamReader(client.getInputStream());
                entrada = new BufferedReader(e);
                texto = new BufferedReader(new InputStreamReader(System.in));
                mensaje = texto.readLine();
                
        
                
                salida = new PrintStream(client.getOutputStream()); 
                salida.println("Ingresa el nuemero aleatorio");//salida de mensaje
                int num;
                Scanner teclado = new Scanner(System.in);
                
                num = teclado.nextInt();
                    int i;    
                for( i=1;i>=5;i++){
                    if (nale<num){
                        System.out.println("Tu numero es mayor");
                    }
                    if (nale>num){
                        System.out.println("Tu numero es menor");
                    }
                    if(nale==num){
                        System.out.println("Felicidades adivinaste");
                    }
                }
                
                enviado = entrada.readLine();//imprimiendo en cliente
                System.out.println("El cliente adivino");//imprimiento en servidor
           
    }
}
