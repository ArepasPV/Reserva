package com.explorenest.Reserva.service;

import com.explorenest.Reserva.domain.Reserva;
import com.explorenest.Reserva.repository.RerservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {
    private RerservaRepository reservaRepository;

    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    public Optional<Reserva> getReservasById(Integer id) {
        return reservaRepository.findOneById(id);
    }

    public Optional<List<Reserva>> getReservasByClienteId(Integer id) {
        return reservaRepository.findReservasByClienteId();
    }

    public Optional<List<Reserva>> getReservasByFechaEntrada(Date fecha) {
        return reservaRepository.findReservasByFechaEntrada(fecha);
    }

    public Optional<List<Reserva>> getReservasByFechaSalida(Date fecha) {
        return reservaRepository.findReservasByFechaSalida(fecha);
    }
}
