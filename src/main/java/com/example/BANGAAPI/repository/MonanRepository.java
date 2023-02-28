package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Monan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonanRepository extends JpaRepository<Monan, String> {
}
