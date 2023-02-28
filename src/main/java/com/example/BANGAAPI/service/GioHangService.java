package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Ctgiohang;
import com.example.BANGAAPI.entity.Giohang;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GioHangService {
    List<Giohang> getGioHang();
    void createGioHang(Giohang giohang);

    List<Ctgiohang> getCTGH();
    void createCTGH (Ctgiohang ctgiohang);
}
