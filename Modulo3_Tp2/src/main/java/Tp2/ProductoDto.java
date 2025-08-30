package Tp2;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
    private int precio;
    private String nombre;
    private int codigo;
    @Override
    public String toString() {
        return " Nombre: " + nombre +
                " |Precio: " + precio  +
                " |Codigo: " + codigo+"\n" ;
    }
}
