package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Ctdh;
import com.example.BANGAAPI.entity.Donhang;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DonhangService {
    List<Donhang> getDonhang();
    void createDonHang (Donhang donhang);

    List<Ctdh> getCTDH();
    void createCTDH (Ctdh ctdh);
}
