package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Quyen;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuyenService {
    List<Quyen> getQuyen();
    void createQuyen (Quyen quyen);
}
