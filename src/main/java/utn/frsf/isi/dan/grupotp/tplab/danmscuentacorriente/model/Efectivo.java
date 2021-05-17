package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

//import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

//@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Efectivo {
    /*  @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) */
    //esto en realidad es la clase hijo, como se hace bien?
    private Integer nroRecibo;

    //TODO hacer las relaciones entre clases


    public Integer getNroRecibo() {return nroRecibo;}

    public void setNroRecibo(Integer nroRecibo) {this.nroRecibo = nroRecibo;}
}
