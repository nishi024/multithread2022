package it.fi.meucci;

public class serverThread {
    public void avvio(){
        try{
            for(;;){
                System.out.println("salve");
                System.exit(1);
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }


}
