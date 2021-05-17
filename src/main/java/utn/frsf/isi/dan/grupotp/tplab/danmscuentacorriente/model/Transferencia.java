package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Transferencia extends FormaPago {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cbuOrigen;
    private String cbuDestino;
    private Long codigoTransferencia;
    //TODO hacer las relaciones entre clases


    public Transferencia(Integer id, String observacion, String cbuOrigen, String cbuDestino, Long codigoTransferencia) {
        super(id, observacion);
        this.cbuOrigen = cbuOrigen;
        this.cbuDestino = cbuDestino;
        this.codigoTransferencia = codigoTransferencia;
    }

    public Transferencia(String cbuOrigen, String cbuDestino, Long codigoTransferencia) {
        this.cbuOrigen = cbuOrigen;
        this.cbuDestino = cbuDestino;
        this.codigoTransferencia = codigoTransferencia;
    }

    public Transferencia() {
 }

    public String getCbuOrigen() {return cbuOrigen;}

    public void setCbuOrigen(String cbuOrigen) {this.cbuOrigen = cbuOrigen;}

    public String getCbuDestino() {return cbuDestino;}

    public void setCbuDestino(String cbuDestino) {this.cbuDestino = cbuDestino;}

    public Long getCodigoTransferencia() {return codigoTransferencia;}

    public void setCodigoTransferencia(Long codigoTransferencia) {this.codigoTransferencia = codigoTransferencia;}
}
