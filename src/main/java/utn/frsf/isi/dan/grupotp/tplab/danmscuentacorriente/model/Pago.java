package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Instant fechaPago;
    @OneToOne
    private FormaPago formaPago;
    @Transient
    private Cliente cliente;


    public Pago(Integer id, Instant fechaPago) {
        this.id = id;
        this.fechaPago = fechaPago;
    }

    public Pago() {
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public Instant getFechaPago() { return fechaPago;}

    public void setFechaPago(Instant fechaPago) {this.fechaPago = fechaPago; }
}
