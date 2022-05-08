package com.app.controller.admin;

import com.app.dto.BrandDto;
import com.app.service.BrandService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/admin/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @Autowired
    private ObjectMapper objectMapper;

    /**
     */
    @GetMapping("findAll")
    public ResponseEntity<String> findAll() {
        try {
            List<BrandDto> brandDtos = brandService.findAll();
            String json = objectMapper.writeValueAsString(brandDtos);
            return new ResponseEntity<>(json, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @PostMapping("add")
    public ResponseEntity<String> add(){
        try {
//            BrandDto brandDto = objectMapper.readValue(json, BrandDto.class);

        } catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }









}
