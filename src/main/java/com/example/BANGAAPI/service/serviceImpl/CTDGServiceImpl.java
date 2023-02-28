package com.example.BANGAAPI.service.serviceImpl;


import com.example.BANGAAPI.entity.Ctdanhgia;
import com.example.BANGAAPI.model.DanhGiaRequest;
import com.example.BANGAAPI.repository.CtdanhgiaRepository;
import com.example.BANGAAPI.service.CTDGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CTDGServiceImpl implements CTDGService {
    @Autowired
    private CtdanhgiaRepository ctdanhgiaRepository;

    @Override
    public List<Ctdanhgia> getCTDG(){
        return ctdanhgiaRepository.findAll();
    }

    @Override
    public void createDG(DanhGiaRequest request) {
//        ctdanhgiaRepository.saveDanhGia(request.getSoSao(), request.getNhanXet(), request.getKhachHangId(),request.getCtdhid());
    }
}
