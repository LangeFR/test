package Test_PKG;


public class Perro {
    private String nombre;
    private String correo;
    private int  nickName;

    Perro(String nombre, String correo, int nickName){
        this.nombre = nombre;
        this.correo = correo;
        this.nickName = nickName;
    }

    public String getNombre(){return nombre;}
    public String getCorreo(){return correo;}
}
