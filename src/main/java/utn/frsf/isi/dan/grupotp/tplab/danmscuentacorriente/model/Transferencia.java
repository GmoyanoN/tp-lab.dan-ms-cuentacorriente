package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model;

import com.fasterxml.jackson.annotation.*;

//import javax.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

//@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Transferencia {
    /*  @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) */
    //esto en realidad es la clase hijo, como se hace bien?
    private String cbuOrigen;
    private String cbuDestino;
    private Long codigoTransferencia;
    //TODO hacer las relaciones entre clases


    public String getCbuOrigen() {return cbuOrigen;}

    public void setCbuOrigen(String cbuOrigen) {this.cbuOrigen = cbuOrigen;}

    public String getCbuDestino() {return cbuDestino;}

    public void setCbuDestino(String cbuDestino) {this.cbuDestino = cbuDestino;}

    public Long getCodigoTransferencia() {return codigoTransferencia;}

    public void setCodigoTransferencia(Long codigoTransferencia) {this.codigoTransferencia = codigoTransferencia;}
}
