package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Ctgia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtgiaRepository extends JpaRepository<Ctgia, Long> {
}
