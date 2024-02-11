package com.sign.signdirector.service.place;

import com.sign.signdirector.dto.consult.ConsultingDTO;
import com.sign.signdirector.entity.consult.Consulting;

public interface
PlaceService {
    Consulting saveSimpleConsulting(ConsultingDTO consultingDTO);
}
