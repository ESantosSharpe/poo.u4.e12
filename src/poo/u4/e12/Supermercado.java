package poo.u4.e12;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    public List<Compra> compra=new ArrayList<>();

    public void ingresarCompras(){
        String nombre;
        double precio;
        int cantidad;
        Compra aux;
        int lista=(int)(Math.random()*8)+1;
        for (int i = 0; i < lista; i++) {
            nombre="Producto"+(i+1);
            precio=Math.random()*100;
            precio=Math.floor(precio*100)/100;
            cantidad=(int)(Math.random()*10)+1;
            aux=new Compra();
            aux.setNombre(nombre);
            aux.setPrecio(precio);
            aux.setCantidad(cantidad);
            compra.add(aux);
        }
    }

    public void ticket(){
            double precioFinal=0;
            for (int i = 0; i < compra.size(); i++) {
            Compra aux=compra.get(i);
            String nombre=aux.getNombre();
            double precio=aux.getPrecio();
            int cantidad=aux.getCantidad();
            double total=precio*cantidad;
            total=Math.floor(total*100)/100;
            System.out.println("***************Cantidad***Precio*****Total");
            System.out.println(nombre+"             "+cantidad+"   "+precio+"      "+total);
            precioFinal+=total;
        }
            precioFinal=Math.floor(precioFinal*100)/100;
        System.out.println("Precio final                         "+precioFinal);
    }

}
