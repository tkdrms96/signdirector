package com.sign.signdirector.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleConsultingDTO {

    private String placeNm;
    private String placeTel;
    private String placeJuso;
    private String placeCategory;

}
