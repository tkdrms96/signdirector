package com.sign.signdirector.service;

import com.sign.signdirector.dto.SimpleConsultingDTO;
import com.sign.signdirector.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService{

    private final PlaceRepository placeRepository;

    @Override
    public int saveSimpleConsulting(SimpleConsultingDTO simpleConsultingDTO) {
        return placeRepository.save(simpleConsultingDTO);
    }
}
