package com.example.BANGAAPI.controller;

import com.example.BANGAAPI.entity.Ctkm;
import com.example.BANGAAPI.entity.Khuyenmai;
import com.example.BANGAAPI.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/khuyenmai")
public class KhuyenMaiController {

    @Autowired
    private KhuyenMaiService khuyenMaiService;

    @GetMapping()
    public List<Khuyenmai> getKhuyenMai(){
        return khuyenMaiService.getKhuyenMai();
    }

    @PostMapping("/addKM")
    public void createKhuyenMai (@RequestBody Khuyenmai khuyenmai){
        khuyenMaiService.createKhuyenMai(khuyenmai);
    }

    @GetMapping("/ctkm")
    public List<Ctkm> getCTKM(){
        return khuyenMaiService.getCTKM();
    }

    @PostMapping("/addctkm")
    public void createCTKM( @RequestBody Ctkm ctkm){
        khuyenMaiService.createCTKM(ctkm);
    }
}
