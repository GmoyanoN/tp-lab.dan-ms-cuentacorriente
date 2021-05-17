package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class FormaPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //esto en realidad es la clase padre, hay otras que heredan, como se hace bien?
    private Integer id;
    private String observacion;

    //TODO hacer las relaciones entre clases


    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getObservacion() {return observacion;}

    public void setObservacion(String observacion) {this.observacion = observacion;}
}
