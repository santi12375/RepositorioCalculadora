package calculadoramvc;

import controlador.CtrOperaciones;
import vista.IguOperaciones;
import modelo.Operaciones;

public class CalculadoraMVC {

   
    public static void main(String[] args) {
        
        Operaciones operaciones = new Operaciones();
        IguOperaciones interfazOperaciones = new IguOperaciones();
        CtrOperaciones ctrOperaciones = 
                new CtrOperaciones(interfazOperaciones, operaciones);
System.out.println("Esto es contenido mal identado");        
        ctrOperaciones.inicializarVista();
        
        interfazOperaciones.setVisible(true);
        
    }
    
}
