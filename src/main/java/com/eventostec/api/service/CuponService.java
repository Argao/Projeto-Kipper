package com.eventostec.api.service;

import com.eventostec.api.domain.cupon.Cupon;
import com.eventostec.api.domain.cupon.CuponRequestDTO;
import com.eventostec.api.domain.event.Event;
import com.eventostec.api.repositories.CuponRepository;
import com.eventostec.api.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class CuponService {

    @Autowired
    private CuponRepository cuponRepository;

    @Autowired
    private EventRepository eventRepository;

    public Cupon addCuponToEvent(UUID eventId, CuponRequestDTO data){
        Event event = eventRepository.findById(eventId)
                .orElseThrow(() -> new IllegalArgumentException("Event not found"));

        Cupon cupon = new Cupon();

        cupon.setCode(data.code());
        cupon.setDiscount(data.discount());
        cupon.setValid(new Date(data.valid()));
        cupon.setEvent(event);

        return cuponRepository.save(cupon);
    }


}
