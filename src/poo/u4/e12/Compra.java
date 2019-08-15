package poo.u4.e12;

public class Compra extends Producto{
    public double precio;
    public int cantidad;
    
    
    public Compra(){
        
    }
    public Compra(String nombre, double precio, int cantidad){
        super(nombre);
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
