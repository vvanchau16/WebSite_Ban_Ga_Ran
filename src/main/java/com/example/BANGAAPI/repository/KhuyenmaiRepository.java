package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Khuyenmai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhuyenmaiRepository extends JpaRepository <Khuyenmai, String> {
}
