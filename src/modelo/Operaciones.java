package modelo;

public class Operaciones {
    
    private int numeroUno;
    private int numeroDos;
    private float total;
    

    public Operaciones() {
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }
    
    public int sumar(){
        this.total=this.numeroUno+this.numeroDos;
        return (int)this.total;
    }
    
    public int restar(){
        this.total=this.numeroUno-this.numeroDos;
        return (int)this.total;
    }
    
    public int multiplicar(){
        this.total=this.numeroUno*this.numeroDos;
        return (int)this.total;
    }
    
    public float dividir(){
        if (numeroDos==0) {
            this.total=0;
        }else{
            this.total=this.numeroUno/this.numeroDos;
        }
        return this.total;
    }

    public float getTotal() {
        return total;
    }
    
    
    
    
    
}
