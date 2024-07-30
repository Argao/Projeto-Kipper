package com.eventostec.api.controller;

import com.eventostec.api.domain.cupon.Cupon;
import com.eventostec.api.domain.cupon.CuponRequestDTO;
import com.eventostec.api.service.CuponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/cupon")
public class CuponController {

    @Autowired
    private CuponService cuponService;

    @PostMapping("/event/{eventId}")
    public ResponseEntity<Cupon> create(@PathVariable UUID eventId, @RequestBody CuponRequestDTO data){
        Cupon newCupon = this.cuponService.addCuponToEvent(eventId ,data);
        return ResponseEntity.ok(newCupon);
    }
}
