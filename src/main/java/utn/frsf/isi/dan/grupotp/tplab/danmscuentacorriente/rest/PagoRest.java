    package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.rest;

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

    @PostMapping
    public ResponseEntity<Pago> crearPago(@RequestBody Pago pago){
        return ResponseEntity.ok(pagoService.crearPago(pago));
    }

}
