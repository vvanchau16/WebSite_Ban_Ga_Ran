package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Khachhang;
import com.example.BANGAAPI.repository.KhachhangRepository;
import com.example.BANGAAPI.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachhangServiceImpl implements KhachhangService {
    @Autowired
    KhachhangRepository khachhangRepository;

    @Override
    public List<Khachhang> getKhachhang(){
        return khachhangRepository.findAll();
    }

    @Override
    public void createKhachHang(Khachhang khachhang){
         khachhangRepository.saveAndFlush(khachhang);
    }

}
