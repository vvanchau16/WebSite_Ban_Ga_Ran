package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Ctgiohang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtgiohangRepository extends JpaRepository <Ctgiohang, String>{
}
