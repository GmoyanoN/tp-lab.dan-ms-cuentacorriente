package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

//@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Cheque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //esto en realidad es la clase hijo, como se hace bien?
    private Integer nroCheque;
    private Instant fechaCobro;
    private String banco;

    //TODO hacer las relaciones entre clases


    public Integer getNroCheque() {return nroCheque; }

    public void setNroCheque(Integer nroCheque) {this.nroCheque = nroCheque; }

    public Instant getFechaCobro() {return fechaCobro;}

    public void setFechaCobro(Instant fechaCobro) {this.fechaCobro = fechaCobro;}

    public String getBanco() {return banco; }

    public void setBanco(String banco) {this.banco = banco;}
}
