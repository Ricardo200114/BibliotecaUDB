package blb.modelo;

public class Materiales {

    private int id;
    private String codId, nombreMaterial, tipoMaterial, autor;
    private int noEstante, unidades;

    public Materiales() {
    }

    public Materiales(String codId, String nombreMaterial, String tipoMaterial, String autor, int noEstante, int unidades) {
        this.codId = codId;
        this.nombreMaterial = nombreMaterial;
        this.tipoMaterial = tipoMaterial;
        this.autor = autor;
        this.noEstante = noEstante;
        this.unidades = unidades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodId() {
        return codId;
    }

    public void setCodId(String codId) {
        this.codId = codId;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNoEstante() {
        return noEstante;
    }

    public void setNoEstante(int noEstante) {
        this.noEstante = noEstante;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

}
