package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
public class Efectivo extends FormaPago {
    private Integer nroRecibo;

    public Efectivo(Integer id, String observacion, Integer nroRecibo) {
        super(id, observacion);
        this.nroRecibo = nroRecibo;
    }

    public Efectivo(Integer nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

    public Efectivo(){}

    public Integer getNroRecibo() {return nroRecibo;}

    public void setNroRecibo(Integer nroRecibo) {this.nroRecibo = nroRecibo;}
}
