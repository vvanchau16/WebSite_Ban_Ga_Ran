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

@Entity
@Table(name = "KHACHHANG")
public class Khachhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    @Column(name = "maKH")
    private String maKH;
    @Basic(optional = false)

    @Column(name = "hoKH")
    private String hoKH;
    @Basic(optional = false)

    @Column(name = "tenKH")
    private String tenKH;
    @Basic(optional = false)
    
    @Column(name = "gioiTinh")
    private boolean gioiTinh;
    @Basic(optional = false)

    @Column(name = "SDT")
    private String sdt;
    @Basic(optional = false)

    @Column(name = "email")
    private String email;
    @Basic(optional = false)

    @Column(name = "diaChi")
    private String diaChi;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maKH")
    private List<Donhang> donhangList;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "maKH")
    private Giohang giohang;

    @JoinColumn(name = "tenDN", referencedColumnName = "tenDN")
    @OneToOne(optional = false)
    private Taikhoan tenDN;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maKH")
    private List<Ctdanhgia> ctdanhgiaList;

    public Khachhang() {
    }

    public Khachhang(String maKH, String hoKH, String tenKH, boolean gioiTinh, String sdt, String email, String diaChi, Taikhoan tenDN) {
        this.maKH = maKH;
        this.hoKH = hoKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.tenDN = tenDN;
    }

    public Khachhang(String maKH) {
        this.maKH = maKH;
    }

    public Khachhang(String maKH, String hoKH, String tenKH, boolean gioiTinh, String sdt, String email, String diaChi) {
        this.maKH = maKH;
        this.hoKH = hoKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoKH() {
        return hoKH;
    }

    public void setHoKH(String hoKH) {
        this.hoKH = hoKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Taikhoan getTenDN() {
        return tenDN;
    }

    public void setTenDN(Taikhoan tenDN) {
        this.tenDN = tenDN;
    }

}
