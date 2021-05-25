package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
public class Cheque extends FormaPago {
    private Integer nroCheque;
    private Instant fechaCobro;
    private String banco;

    public Cheque(Integer id, String observacion, Integer nroCheque, Instant fechaCobro, String banco) {
        super(id, observacion);
        this.nroCheque = nroCheque;
        this.fechaCobro = fechaCobro;
        this.banco = banco;
    }

    public Cheque(Integer nroCheque, Instant fechaCobro, String banco) {
        this.nroCheque = nroCheque;
        this.fechaCobro = fechaCobro;
        this.banco = banco;
    }

    public Cheque(){}

    public Integer getNroCheque() {return nroCheque; }

    public void setNroCheque(Integer nroCheque) {this.nroCheque = nroCheque; }

    public Instant getFechaCobro() {return fechaCobro;}

    public void setFechaCobro(Instant fechaCobro) {this.fechaCobro = fechaCobro;}

    public String getBanco() {return banco; }

    public void setBanco(String banco) {this.banco = banco;}
}
