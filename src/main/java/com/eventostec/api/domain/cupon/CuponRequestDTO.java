package com.eventostec.api.domain.cupon;

import com.eventostec.api.domain.event.Event;

public record CuponRequestDTO(String code, Integer discount, Long valid) {
}
