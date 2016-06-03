
package gestor;

public class Gestor {
    public Gestor(){}
    
    private String comando;
    
    public void lanzarApp(String comando)
    {
        this.comando = comando;
        Runtime aplicacion = Runtime.getRuntime(); 
        switch (comando)
        {
            case "BLOCK DE NOTAS":
                    try{aplicacion.exec("C:/Windows/System32/NOTEPAD.EXE"); }
                    catch(Exception e){}
                    break;
            case "WORD":
                    try{aplicacion.exec("C:\\Program Files\\Microsoft Office\\Office15\\WINWORD.EXE"); }
                    catch(Exception e){}
                    break;
        }
        

    
    
    }
    
}
