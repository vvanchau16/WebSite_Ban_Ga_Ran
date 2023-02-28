package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Quyen;
import com.example.BANGAAPI.repository.QuyenRepository;
import com.example.BANGAAPI.service.QuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuyenServiceImpl implements QuyenService {
    @Autowired
    QuyenRepository quyenRepository;

    @Override
    public List<Quyen> getQuyen(){
        return quyenRepository.findAll();
    }

    @Override
    public void createQuyen(Quyen quyen){
        quyenRepository.save(quyen);
    }
}
