package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Khachhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachhangRepository extends JpaRepository <Khachhang, String> {
}
