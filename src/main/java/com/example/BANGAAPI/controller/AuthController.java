package com.example.BANGAAPI.controller;

import com.example.BANGAAPI.entity.*;
import com.example.BANGAAPI.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quanly")

public class AuthController {
    @Autowired
    public QuyenService quyenService;
    @Autowired
    public TaikhoanService taikhoanService;

    @GetMapping("/quyen")
    public List<Quyen> getQuyen (){
        return quyenService.getQuyen();
    }
    @GetMapping ("/taikhoan")
    public List<Taikhoan> getTaikhoan (){
        return taikhoanService.getTaikhoan();
    }

    @PostMapping("/themtaikhoan")
    public void createTaiKhoan(@RequestBody Taikhoan taikhoan){
        taikhoanService.createTaiKhoan(taikhoan);
    }

    @PostMapping("/themquyen")
    public void createQuyen (@RequestBody Quyen quyen ){
        quyenService.createQuyen(quyen);
    }

}
