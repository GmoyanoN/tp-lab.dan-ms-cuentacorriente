package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.service;

import utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model.Pago;

import java.util.List;
import java.util.Optional;

public interface PagoService {
    List<Pago> buscarTodos();
    Pago crearPago(Pago pago);
    Optional<List<Pago>> buscarPagoPorCliente(Integer id);
}
