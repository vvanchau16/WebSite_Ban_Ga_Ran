package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Danhmuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhmucRepository extends JpaRepository<Danhmuc, String> {
}
