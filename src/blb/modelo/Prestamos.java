package blb.modelo;

public class Prestamos {

    private int id;
    private String idUser, nombreUser, idMaterial, nombreMaterial, f_prestamos, f_devolucion;

    public Prestamos() {
    }

    public Prestamos(String idUser, String nombreUser, String idMaterial, String nombreMaterial, String f_prestamos) {
        this.idUser = idUser;
        this.nombreUser = nombreUser;
        this.idMaterial = idMaterial;
        this.nombreMaterial = nombreMaterial;
        this.f_prestamos = f_prestamos;
    }

    public Prestamos(String idUser, String nombreUser, String idMaterial, String nombreMaterial, String f_prestamos, String f_devolucion) {
        this.idUser = idUser;
        this.nombreUser = nombreUser;
        this.idMaterial = idMaterial;
        this.nombreMaterial = nombreMaterial;
        this.f_prestamos = f_prestamos;
        this.f_devolucion = f_devolucion;
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

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(String idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getF_prestamos() {
        return f_prestamos;
    }

    public void setF_prestamos(String f_prestamos) {
        this.f_prestamos = f_prestamos;
    }

    public String getF_devolucion() {
        return f_devolucion;
    }

    public void setF_devolucion(String f_devolucion) {
        this.f_devolucion = f_devolucion;
    }

}
