package Tp2;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Producto {
    private int precio;
    private String nombre;
    private int codigo;
    private String autor;

    @Override
    public String toString() {
        return " Nombre: " + nombre +
                " |Precio: " + precio +
                " |Codigo: " + codigo+
                " |Autor: " +autor+ "\n" ;  }

}
