package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Donhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonhangRepository extends JpaRepository <Donhang, String>{
}
