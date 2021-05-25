    package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model.Pago;
import utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.service.PagoService;

import java.util.List;

    @RestController
@RequestMapping("/api/pago")
public class PagoRest {
    private final PagoService pagoService;
    @Autowired
    public PagoRest(PagoService pagoService){
        this.pagoService = pagoService;
    }

    @GetMapping
    public ResponseEntity<List<Pago>> buscarTodos(){
        return ResponseEntity.ok(pagoService.buscarTodos());
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<Pago>> buscarPagoPorCliente(@PathVariable Integer id){
        return ResponseEntity.of(pagoService.buscarPagoPorCliente(id));
    }

    @PostMapping
    public ResponseEntity<Pago> crearPago(@RequestBody Pago pago){
        return ResponseEntity.ok(pagoService.crearPago(pago));
    }

}
