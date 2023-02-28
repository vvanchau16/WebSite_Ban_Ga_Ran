package com.example.BANGAAPI.controller;

import com.example.BANGAAPI.entity.Khachhang;
import com.example.BANGAAPI.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/KH")
public class KhachHangController {
    @Autowired
    private KhachhangService khachhangService;

    @GetMapping()
    public List<Khachhang> getKhachhang() {
        return khachhangService.getKhachhang();
    }

    @PostMapping()
    public void createKhachHang (@RequestBody Khachhang khachhang){
        khachhangService.createKhachHang(khachhang);
    }
}
