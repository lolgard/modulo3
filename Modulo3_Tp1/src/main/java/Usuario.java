import lombok.*;
@Data
@Builder

public class Usuario {

    private String nombre;
    private int id;
    private String email;

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
