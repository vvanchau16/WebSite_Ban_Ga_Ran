package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Ctgia;
import com.example.BANGAAPI.repository.CtgiaRepository;
import com.example.BANGAAPI.service.CtGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtGiaServiceImpl implements CtGiaService {
    @Autowired
    private CtgiaRepository ctgiaRepository;

    @Override
    public List<Ctgia> getCTG(){
        return ctgiaRepository.findAll();
    }
    @Override
    public void createCTG(Ctgia ctgia) {
        ctgiaRepository.save(ctgia);
    }
}
