package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Ctkm;
import com.example.BANGAAPI.entity.Khuyenmai;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface KhuyenMaiService {
    List<Khuyenmai> getKhuyenMai();
    void createKhuyenMai (Khuyenmai khuyenmai);

    List<Ctkm> getCTKM();
    void createCTKM (Ctkm ctkm);
}
