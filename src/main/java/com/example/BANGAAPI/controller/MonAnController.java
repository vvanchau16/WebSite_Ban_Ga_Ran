package com.example.BANGAAPI.controller;

import com.example.BANGAAPI.entity.Ctgia;
import com.example.BANGAAPI.entity.Monan;
import com.example.BANGAAPI.service.CtGiaService;
import com.example.BANGAAPI.service.MonanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monan")
public class MonAnController {
    @Autowired
    private MonanService monanService;

    @Autowired
    private CtGiaService ctGiaService;

    @GetMapping()
    public List<Monan> getMonAn(){
        return monanService.getMonan();
    }

    @PostMapping()
    public void createMonAn (@RequestBody Monan monan){
        monanService.createMonAn(monan);
    }

    @GetMapping("/listgia")
    public List<Ctgia> getCTG(){
        return ctGiaService.getCTG();
    }
    @PostMapping("/gia")
    public void createCTG(@RequestBody Ctgia ctgia){
        ctGiaService.createCTG(ctgia);
    }
}
