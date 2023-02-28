/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BANGAAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "GIOHANG")
public class Giohang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    @Column(name = "maGioHang")
    private String maGioHang;

    @JoinColumn(name = "maKH", referencedColumnName = "maKH")
    @OneToOne(optional = false)
    private Khachhang maKH;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maGioHang")
    private List<Ctgiohang> ctgiohangList;

    public Giohang() {
    }
    public Giohang(String maGioHang, Khachhang maKH ){
        this.maGioHang = maGioHang;
        this.maKH = maKH;
    }
    public Giohang(String maGioHang) {this.maGioHang = maGioHang;}


    public String getMaGioHang() {
        return maGioHang;
    }

    public void setMaGioHang(String maGioHang) {
        this.maGioHang = maGioHang;
    }

    public Khachhang getMaKH() {
        return maKH;
    }

    public void setMaKH(Khachhang maKH) {
        this.maKH = maKH;
    }


}
