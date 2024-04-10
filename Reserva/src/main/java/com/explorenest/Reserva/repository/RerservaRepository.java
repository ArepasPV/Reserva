package com.explorenest.Reserva.repository;

import com.explorenest.Reserva.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface RerservaRepository extends JpaRepository<Reserva, Integer> {
    Optional<Reserva> findOneById(Integer id);

    Optional<List<Reserva>> findReservasByClienteId();

    Optional<List<Reserva>> findReservasByFechaEntrada(Date fecha);

    Optional<List<Reserva>> findReservasByFechaSalida(Date fecha);
}
