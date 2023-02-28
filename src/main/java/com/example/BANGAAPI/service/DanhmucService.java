package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Danhmuc;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DanhmucService {
    List<Danhmuc> getDanhmuc();
    void createDanhMuc (Danhmuc danhmuc) ;
}
