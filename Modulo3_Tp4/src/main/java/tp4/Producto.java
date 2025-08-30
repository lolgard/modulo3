package tp4;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class Producto {
    private String nombre;
    private String codigo;
    private String proveedor;
    private Double precio;
}
