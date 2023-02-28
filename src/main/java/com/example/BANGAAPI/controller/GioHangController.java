package com.example.BANGAAPI.controller;

import com.example.BANGAAPI.entity.Ctgiohang;
import com.example.BANGAAPI.entity.Giohang;
import com.example.BANGAAPI.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/giohang")
public class GioHangController {

    @Autowired
    private GioHangService gioHangService;

    @GetMapping()
    public List<Giohang> getGioHang(){
        return gioHangService.getGioHang();
    }

    @PostMapping("/addgiohang")
    public void createGioHang(Giohang giohang){
        gioHangService.createGioHang(giohang);
    }

    @GetMapping("/ctgh")
    public List<Ctgiohang> getCTGH(){
        return gioHangService.getCTGH();
    }
}
