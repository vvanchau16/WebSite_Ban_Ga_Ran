package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Quyen;
import com.example.BANGAAPI.entity.Taikhoan;
import com.example.BANGAAPI.repository.QuyenRepository;
import com.example.BANGAAPI.repository.TaikhoanRepository;
import com.example.BANGAAPI.service.TaikhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TaikhoanServiceImpl implements TaikhoanService {
    @Autowired
    TaikhoanRepository taikhoanRepository ;

    @Override
    public List<Taikhoan> getTaikhoan() {
        return taikhoanRepository.findAll();
    }

    @Override
    public void createTaiKhoan (Taikhoan taikhoan){
        taikhoanRepository.saveAndFlush(taikhoan);
    }
}
