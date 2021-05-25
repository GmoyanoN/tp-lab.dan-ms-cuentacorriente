package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIdentityInfo(scope= Pago.class,generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fechaPago;
    @OneToOne(cascade = CascadeType.ALL)
    private FormaPago formaPago;
    @Transient
    private Cliente cliente;
    private Integer idCliente;

    public Pago(Integer id, LocalDateTime fechaPago, FormaPago formaPago, Cliente cliente, Integer idCliente) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.formaPago = formaPago;
        this.cliente = cliente;
        this.idCliente = idCliente;
    }

    public Pago() {
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public LocalDateTime getFechaPago() { return fechaPago;}

    public void setFechaPago(LocalDateTime fechaPago) {this.fechaPago = fechaPago; }

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

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}
