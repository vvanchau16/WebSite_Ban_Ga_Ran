package com.example.BANGAAPI.controller;

import com.example.BANGAAPI.entity.Ctdh;
import com.example.BANGAAPI.entity.Donhang;
import com.example.BANGAAPI.service.DonhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donhang")
public class DonHangController {
    @Autowired
    private DonhangService donhangService;

    @GetMapping()
    public List<Donhang> getDonHang(){
        return donhangService.getDonhang();
    }

    @PostMapping("/dathang")
    public void createDonHang (@RequestBody Donhang donhang){
        donhangService.createDonHang(donhang);
    }

    @GetMapping("/ctdh")
    public List<Ctdh> getCTDH(){
        return donhangService.getCTDH();
    }
    @PostMapping("/addctdh")
    public void createCTDH (@RequestBody Ctdh ctdh){
        donhangService.createCTDH(ctdh);
    }
}
