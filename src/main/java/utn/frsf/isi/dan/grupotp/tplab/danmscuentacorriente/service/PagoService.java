package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.service;

import utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model.Pago;

import java.util.List;

public interface PagoService {
    List<Pago> buscarTodos();
    Pago crearPago(Pago pago);
}
