package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Ctgia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CtGiaService {
    List <Ctgia> getCTG();
    void createCTG(Ctgia ctgia);
}
