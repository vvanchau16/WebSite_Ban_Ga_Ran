package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Ctdanhgia;
import com.example.BANGAAPI.model.DanhGiaRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CTDGService {
    List<Ctdanhgia> getCTDG();
    void createDG(DanhGiaRequest request);
}
