package utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import utn.frsf.isi.dan.grupotp.tplab.danmscuentacorriente.model.Pago;

import java.util.List;
import java.util.Optional;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
    @Query(value = "SELECT p from Pago p where p.idCliente = :id")
    public Optional<List<Pago>> buscarPagoPorCliente(Integer id);
}
