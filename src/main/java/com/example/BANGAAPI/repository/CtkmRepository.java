package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Ctkm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtkmRepository extends JpaRepository <Ctkm, String>  {
}
