package com.sign.signdirector.dto.consult;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsultingDTO {

    private String placeNm;
    private String placeTel;
    private String placeJuso;
    private String placeCategory;

}
