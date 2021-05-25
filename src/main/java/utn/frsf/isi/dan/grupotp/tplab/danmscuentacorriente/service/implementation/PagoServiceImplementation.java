package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model.Pago;
import utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.repositories.PagoRepository;
import utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.service.PagoService;

import java.util.List;

@Service
public class PagoServiceImplementation implements PagoService {

    private final PagoRepository pagoRepository;
    @Autowired
    public PagoServiceImplementation(PagoRepository pagoRepository){
        this.pagoRepository = pagoRepository;
    }

    @Override
    public List<Pago> buscarTodos(){
        return pagoRepository.findAll();
    }

    @Override
    public Pago crearPago(Pago pago) {
        return pagoRepository.save(pago);
    }
}
