package com.example.BANGAAPI.service;

import com.example.BANGAAPI.entity.Quyen;
import com.example.BANGAAPI.entity.Taikhoan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaikhoanService {
    List<Taikhoan> getTaikhoan ();
    void createTaiKhoan(Taikhoan taikhoan);
}
