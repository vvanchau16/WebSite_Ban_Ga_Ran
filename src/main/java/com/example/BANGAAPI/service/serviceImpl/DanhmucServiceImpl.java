package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Danhmuc;
import com.example.BANGAAPI.repository.DanhmucRepository;
import com.example.BANGAAPI.service.DanhmucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhmucServiceImpl implements DanhmucService {
    @Autowired
    DanhmucRepository danhmucRepository;

    @Override
    public List<Danhmuc> getDanhmuc(){
        return danhmucRepository.findAll();
    }

    @Override
    public void createDanhMuc (Danhmuc danhmuc){
        danhmucRepository.save(danhmuc);
    }
}
