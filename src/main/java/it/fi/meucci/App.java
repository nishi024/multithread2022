package it.fi.meucci;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        serverThread tcpServer= new serverThread();
        tcpServer.avvio();
    }
}
