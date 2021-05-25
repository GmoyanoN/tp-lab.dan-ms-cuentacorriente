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
public class Cheque extends FormaPago {
    private Integer nroCheque;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime fechaCobro;
    private String banco;

    public Cheque(Integer id, String observacion, Integer nroCheque, LocalDateTime fechaCobro, String banco) {
        super(id, observacion);
        this.nroCheque = nroCheque;
        this.fechaCobro = fechaCobro;
        this.banco = banco;
    }

    public Cheque(Integer nroCheque, LocalDateTime fechaCobro, String banco) {
        this.nroCheque = nroCheque;
        this.fechaCobro = fechaCobro;
        this.banco = banco;
    }

    public Cheque(){}

    public Integer getNroCheque() {return nroCheque; }

    public void setNroCheque(Integer nroCheque) {this.nroCheque = nroCheque; }

    public LocalDateTime getFechaCobro() {return fechaCobro;}

    public void setFechaCobro(LocalDateTime fechaCobro) {this.fechaCobro = fechaCobro;}

    public String getBanco() {return banco; }

    public void setBanco(String banco) {this.banco = banco;}
}
