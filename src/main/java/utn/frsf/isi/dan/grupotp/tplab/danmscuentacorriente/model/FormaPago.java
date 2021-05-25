package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;
//Vamos a usar "Joined Table" para el mapeo
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class FormaPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String observacion;

    public FormaPago(Integer id, String observacion) {
        this.id = id;
        this.observacion = observacion;
    }

    public FormaPago() {
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getObservacion() {return observacion;}

    public void setObservacion(String observacion) {this.observacion = observacion;}
}
