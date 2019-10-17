/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina_numero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author compu
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) throws IOException {
        // TODO code application logic here
        
        Socket client = null;
        ServerSocket server;
        BufferedReader entrada, texto;
        PrintStream salida;
        String mensaje, enviado;
        
         int nale = (int)(Math.random()*10)+1;
         
         
         salida = new PrintStream(client.getOutputStream());
                salida.println("");
                
                
                System.out.println("El numero random es: " + nale);
                
                return nale;
                
                
    }
    
}
