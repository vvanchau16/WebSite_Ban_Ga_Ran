package com.example.BANGAAPI.controller;

import com.example.BANGAAPI.entity.Danhmuc;
import com.example.BANGAAPI.service.DanhmucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/danhmuc")
public class DanhMucController {
    @Autowired
    private DanhmucService danhmucService;

    @GetMapping()
    public List<Danhmuc> getDanhMuc(){
        return danhmucService.getDanhmuc();
    }

    @PostMapping
    public void createDanhMuc (@RequestBody Danhmuc danhmuc){
        danhmucService.createDanhMuc(danhmuc);
    }
}
