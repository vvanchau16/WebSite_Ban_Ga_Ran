package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Monan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MonanService {
    List<Monan> getMonan();
    void createMonAn(Monan monan);
}
