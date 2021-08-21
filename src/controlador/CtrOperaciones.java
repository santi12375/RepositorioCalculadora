package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Operaciones;
import vista.IguOperaciones;

public class CtrOperaciones implements ActionListener{

    private IguOperaciones interfazOperaciones;
    private Operaciones operaciones;

    public CtrOperaciones(IguOperaciones interfazOperaciones, Operaciones operaciones) {
        this.interfazOperaciones = interfazOperaciones;
        this.operaciones = operaciones;
        this.interfazOperaciones.btnSumar.addActionListener(this);
    }
    
    public void inicializarVista(){
        interfazOperaciones.setTitle("Operaciones con MVC");
        interfazOperaciones.setLocationRelativeTo(null);
        
    }
  
    
    @Override
    public void actionPerformed(ActionEvent e) {
         operaciones.setNumeroUno(
                 Double.parseDouble(interfazOperaciones.txtNumeroUno.getText()));
         operaciones.setNumeroDos(
                 Double.parseDouble(interfazOperaciones.txtNumeroDos.getText()));
         
         if (interfazOperaciones.CBoperacion.getSelectedIndex()==0) {
            operaciones.sumar();
         }
         else if(interfazOperaciones.CBoperacion.getSelectedIndex()==1){
             operaciones.restar();
         }
         else if(interfazOperaciones.CBoperacion.getSelectedIndex()==2){
             operaciones.multiplicar();
         }
         else{
             operaciones.dividir();
         }
            interfazOperaciones.lblMostrarResultado.
                 setText(String.valueOf(operaciones.getTotal()));
    }
    
}
