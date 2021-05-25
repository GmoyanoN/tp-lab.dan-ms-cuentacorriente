package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIdentityInfo(scope= Pago.class,generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Instant fechaPago;
    @OneToOne
    private FormaPago formaPago;
    @Transient
    private Cliente cliente;


    public Pago(Integer id, Instant fechaPago, FormaPago formaPago, Cliente cliente) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.formaPago = formaPago;
        this.cliente = cliente;
    }

    public Pago() {
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public Instant getFechaPago() { return fechaPago;}

    public void setFechaPago(Instant fechaPago) {this.fechaPago = fechaPago; }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
