package Tp2;

import lombok.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto u1 = new Producto.ProductoBuilder().autor("manolo").nombre("trapo").codigo(1).precio(100).build();
        Producto u2 = new Producto.ProductoBuilder().autor("maria").nombre("rejilla").codigo(2).precio(50).build();
        Producto u3 = new Producto.ProductoBuilder().autor("pedro").nombre("zapatillas").codigo(120).precio(250).build();
        ProductoDto uD1 =new ProductoDto(u1.getPrecio(), u1.getNombre(), u1.getCodigo());
        ProductoDto uD2 =new ProductoDto(u2.getPrecio(), u2.getNombre(), u2.getCodigo());
        ProductoDto uD3 =new ProductoDto(u3.getPrecio(), u3.getNombre(), u3.getCodigo());
        ArrayList a = new ArrayList<>();
        a.add(u1);
        a.add(u2);
        a.add(u3);
        a.add(uD1);
        a.add(uD2);
        a.add(uD3);
        System.out.println(a);

    }
}
