package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Nhanvien;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NhanvienService {

    List<Nhanvien> getNhanVien();

    void createNhanVien(Nhanvien nhanvien);

    void deleteNhanVien(String nhanvien);

}
