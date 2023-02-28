package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Giohang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiohangRepository extends JpaRepository <Giohang, String> {
}
