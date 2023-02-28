package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Ctkm;
import com.example.BANGAAPI.entity.Khuyenmai;
import com.example.BANGAAPI.repository.CtkmRepository;
import com.example.BANGAAPI.repository.KhuyenmaiRepository;
import com.example.BANGAAPI.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenMaiServiceImpl implements KhuyenMaiService {
    @Autowired
    private KhuyenmaiRepository khuyenmaiRepository;

    @Autowired
    private CtkmRepository ctkmRepository;

    @Override
    public List<Khuyenmai> getKhuyenMai(){
        return khuyenmaiRepository.findAll();
    }

    @Override
    public void createKhuyenMai(Khuyenmai khuyenmai) {
        khuyenmaiRepository.save(khuyenmai);
    }

    @Override
    public List<Ctkm> getCTKM(){
        return ctkmRepository.findAll();
    }

    @Override
    public void createCTKM(Ctkm ctkm){
        ctkmRepository.save(ctkm);
    }
}
