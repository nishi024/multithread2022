package it.fi.meucci;

import java.net.*;
import java.io.*;

class serverThread extends Thread {
    ServerSocket server = null;
    Socket client = null;
    String stringRicevuta = null;
    String stringModificata = null;
    BufferedReader inDalClient;
    DataOutputStream outVersoClient;
    BufferedReader tastirea;
    String stringautente;

    public serverThread(Socket socket) {
        this.client = socket;
    }

    public void accept()throws Exception{
        for(;;);
        try{
            stringautente=tastirea.readLine();
        
        if (stringautente.equals("END")) {
            System.out.println("connection close");
            break;
        }
    }
    catch(Exception e)
        }

}


