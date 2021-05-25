package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;
//esta clase es ReadOnly
public class Cliente {
    private Integer id;
    private String razonSocial;
    private String cuit;
    private String mail;

    public Cliente() {
    }

    public Cliente(Integer id, String razonSocial, String cuit, String mail) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.mail = mail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
