package Test_PKG;


public class Perro {
    private String nombre;
    private String correo;
    private String nickName;

    Perro(String nombre, String correo, String nickName){
        this.nombre = nombre;
        this.correo = correo;
        this.nickName = nickName;
    }

    public String getNombre(){return nombre;}
    public String getCorreo(){return correo;}
    public int getNickName(){return nickName;}

    public void setNickName(int nickName){
        this.nickName = nickName;
    }
}
