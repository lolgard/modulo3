public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario.UsuarioBuilder().email("manolo@gmail").nombre("manolo").id(1234).build();
        System.out.println(u1);
    }
}
