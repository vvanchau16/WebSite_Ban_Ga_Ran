package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Nhanvien;
import com.example.BANGAAPI.repository.NhanvienRepository;
import com.example.BANGAAPI.service.NhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanvienServiceImpl implements NhanvienService {
    @Autowired
    NhanvienRepository nhanvienRepository;

    @Override
    public List<Nhanvien> getNhanVien() {
        return nhanvienRepository.findAll();
    }

    @Override
    public void createNhanVien(Nhanvien nhanvien) {
        nhanvienRepository.save(nhanvien);
    }

    @Override
    public void deleteNhanVien(String nhanvien) {

    }

//    @Override
//    public void deleteNhanVien(String maNV) {
//        nhanvienRepository.deleteNhanVienById(maNV);
//    }
}
