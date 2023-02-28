package com.example.BANGAAPI.controller;

import com.example.BANGAAPI.entity.Ctdanhgia;
import com.example.BANGAAPI.model.DanhGiaRequest;
import com.example.BANGAAPI.service.CTDGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/danhgia")
public class DanhGiaController {

    @Autowired
    private CTDGService ctdgService;

    @GetMapping()
    public List<Ctdanhgia> getCTDG(){
        return ctdgService.getCTDG();
    }

    @PostMapping()
    public void createDG(@RequestBody DanhGiaRequest request){
        ctdgService.createDG(request);
    }
}
