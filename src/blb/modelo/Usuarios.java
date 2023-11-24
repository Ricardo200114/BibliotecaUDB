package blb.modelo;

public class Usuarios {

    private int id;
    private String idUser, nombre, apellido, oficio, username, password;
    private int recargo_mora;

    public Usuarios() {
    }

    public Usuarios(String idUser, String nombre, String apellido, String oficio, String username, String password, int recargo_mora) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.oficio = oficio;
        this.username = username;
        this.password = password;
        this.recargo_mora = recargo_mora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRecargo_mora() {
        return recargo_mora;
    }

    public void setRecargo_mora(int recargo_mora) {
        this.recargo_mora = recargo_mora;
    }

}
