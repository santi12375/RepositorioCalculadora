package modelo;

public class Operaciones {
    
    private double numeroUno;
    private double numeroDos;
    private double total;
    

    public Operaciones() {
        //Constructor de operaciones
    }

    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }
    
    public double sumar(){
        this.total=this.numeroUno+this.numeroDos;
        return this.total;
    }
    
    public double restar(){
        this.total=this.numeroUno-this.numeroDos;
        return this.total;
    }
    
    public double multiplicar(){
        this.total=this.numeroUno*this.numeroDos;
        return this.total;
    }
    
    public double dividir(){
        if (numeroDos==0) {
            this.total=0;
        }else{
            this.total=this.numeroUno/this.numeroDos;
        }
        return this.total;
    }

    public double getTotal() {
        return total;
    }
    
}
