package com.example.BANGAAPI.repository;

import com.example.BANGAAPI.entity.Ctdanhgia;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional

public interface CtdanhgiaRepository extends JpaRepository<Ctdanhgia, Long> {

//    @Modifying
//    @Query(value = "insert into ctdanhgia(so_sao, nhan_xet, makh,ctdh) values (:soSao, :nhanXet, :maKH,:ctdhid)", nativeQuery = true)
//    void saveDanhGia(@Param("soSao") int soSao,@Param("nhanXet") String nhanXet,@Param("maKH") String maKH,@Param("ctdhid") int ctdhid );
}
