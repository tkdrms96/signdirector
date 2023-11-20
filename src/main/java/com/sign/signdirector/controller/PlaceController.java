package com.sign.signdirector.controller;

import com.sign.signdirector.dto.SimpleConsultingDTO;
import com.sign.signdirector.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/place")
@RequiredArgsConstructor
public class PlaceController {
    //place repository
    private final PlaceService placeService;
    /* 간편 견적 등록 */
    @PostMapping({"/saveSimpleConsultingAjax"})
    @ResponseBody
    public ResponseEntity<String> saveSimpleConsultingAjax(SimpleConsultingDTO simpleConsultingDTO){
        int result = placeService.saveSimpleConsulting(simpleConsultingDTO);
        return result == 1
                ? new ResponseEntity<>("success", HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
