package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Ctdh;
import com.example.BANGAAPI.entity.Donhang;
import com.example.BANGAAPI.repository.CtdhRepository;
import com.example.BANGAAPI.repository.DonhangRepository;
import com.example.BANGAAPI.service.DonhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonhangServiceImpl implements DonhangService {
    @Autowired
    DonhangRepository donhangRepository;
    @Autowired
    CtdhRepository ctdhRepository;

    @Override
    public List<Donhang> getDonhang(){
        return donhangRepository.findAll();
    }

    @Override
    public void createDonHang(Donhang donhang){
        donhangRepository.saveAndFlush(donhang);
    }

    @Override
    public List<Ctdh> getCTDH(){
        return ctdhRepository.findAll();
    }

    @Override
    public void createCTDH(Ctdh ctdh){
        ctdhRepository.save(ctdh);
    }

}
