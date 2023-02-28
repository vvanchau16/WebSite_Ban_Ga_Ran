/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BANGAAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 *
 * @author ACER
 */
@Entity
@Table(name = "DONHANG")
public class Donhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maDH")
    private String maDH;
    @Basic(optional = false)
    
    @Column(name = "ngayLap")
    @Temporal(TemporalType.DATE)
    private Date ngayLap;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    
    @Column(name = "tongTien")
    private BigDecimal tongTien;
    @Basic(optional = false)
    @Column(name = "SDT")
    private String sdt;
    @Basic(optional = false)

    @Column(name = "diaChiGiaoHang")
    private String diaChiGiaoHang;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maDH")
    private List<Ctdh> ctdhList;

    @JoinColumn(name = "maKH", referencedColumnName = "maKH")
    @ManyToOne(optional = false)
    private Khachhang maKH;

    public Donhang() {
    }

    public Donhang(String maDH) {
        this.maDH = maDH;
    }

    public Donhang(String maDH, Date ngayLap, BigDecimal tongTien, String sdt, String diaChiGiaoHang) {
        this.maDH = maDH;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.sdt = sdt;
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }


    public Khachhang getMaKH() {
        return maKH;
    }

    public void setMaKH(Khachhang maKH) {
        this.maKH = maKH;
    }

}
