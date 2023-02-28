package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Khachhang;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KhachhangService {

     List <Khachhang> getKhachhang();

     void createKhachHang (Khachhang khachhang);
}
