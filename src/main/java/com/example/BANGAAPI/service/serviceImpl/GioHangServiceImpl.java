package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Ctgiohang;
import com.example.BANGAAPI.entity.Giohang;
import com.example.BANGAAPI.repository.CtgiohangRepository;
import com.example.BANGAAPI.repository.GiohangRepository;
import com.example.BANGAAPI.service.GioHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GioHangServiceImpl implements GioHangService {
    @Autowired
    private GiohangRepository giohangRepository;
    @Autowired
    private CtgiohangRepository ctgiohangRepository;
    @Override
    public List<Giohang> getGioHang(){
        return giohangRepository.findAll();
    }

    @Override
    public void createGioHang(Giohang giohang) {
        giohangRepository.saveAndFlush(giohang);
    }

    @Override
    public List<Ctgiohang> getCTGH() {
        return ctgiohangRepository.findAll();
    }

    @Override
    public void createCTGH(Ctgiohang ctgiohang) {
        ctgiohangRepository.saveAndFlush(ctgiohang);
    }
}
