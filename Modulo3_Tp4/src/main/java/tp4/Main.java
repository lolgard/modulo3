package tp4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto u1 = new Producto.ProductoBuilder().nombre("silla").codigo("132").precio(132.1).proveedor("emanuel").build();
        Producto u2 = new Producto.ProductoBuilder().nombre("zapatillas").codigo("102").precio(300.1).proveedor("alan").build();
        Producto u3 = new Producto.ProductoBuilder().nombre("empanadas").codigo("154").precio(200.1).proveedor("roman").build();
        ProductoRecord pr1 = new ProductoRecord(u1.getCodigo(), u1.getNombre(), u1.getPrecio());
        ProductoRecord pr2 = new ProductoRecord(u2.getCodigo(), u2.getNombre(), u2.getPrecio());
        ProductoRecord pr3 = new ProductoRecord(u3.getCodigo(), u3.getNombre(), u3.getPrecio());
        ArrayList<Producto> a = new ArrayList<>();
        ArrayList <ProductoRecord> b = new ArrayList<>();
        a.add(u1);
        a.add(u2);
        a.add(u3);
        b.add(pr1);
        b.add(pr2);
        b.add(pr3);
      
        for (Producto producto : a){
            System.out.println(producto);
        }
        for (ProductoRecord pr : b){
            System.out.println(pr);
        }


    }

}
