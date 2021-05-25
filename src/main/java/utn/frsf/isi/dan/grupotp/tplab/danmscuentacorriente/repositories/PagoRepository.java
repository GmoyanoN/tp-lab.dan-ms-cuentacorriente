package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model.Pago;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
}
