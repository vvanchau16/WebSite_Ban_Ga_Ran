/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BANGAAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 *
 * @author ACER
 */
@Entity
@Table(name = "KHUYENMAI")
public class Khuyenmai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    @Column(name = "maKM")
    private String maKM;
    @Basic(optional = false)

    @Column(name = "tenKM")
    private String tenKM;
    @Basic(optional = false)
    
    @Column(name = "ngayBatDau")
    @Temporal(TemporalType.DATE)
    private Date ngayBatDau;
    @Basic(optional = false)
    
    @Column(name = "ngayKetThuc")
    @Temporal(TemporalType.DATE)
    private Date ngayKetThuc;
    @Basic(optional = false)
    
    @Column(name = "phanTramKM")
    private int phanTramKM;
    @Basic(optional = false)
    
    @Column(name = "trangThai")
    private boolean trangThai;

    @JoinColumn(name = "maNV")
    @ManyToOne
    private Nhanvien maNV;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maKM")
    private List<Ctkm> ctkmList;

    public Khuyenmai() {
    }

    public Khuyenmai(String maKM) {
        this.maKM = maKM;
    }

    public Khuyenmai(String maKM, String tenKM, Date ngayBatDau, Date ngayKetThuc, int phanTramKM, boolean trangThai) {
        this.maKM = maKM;
        this.tenKM = tenKM;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.phanTramKM = phanTramKM;
        this.trangThai = trangThai;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getPhanTramKM() {
        return phanTramKM;
    }

    public void setPhanTramKM(int phanTramKM) {
        this.phanTramKM = phanTramKM;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Nhanvien getMaNV() {
        return maNV;
    }

    public void setMaNV(Nhanvien maNV) {
        this.maNV = maNV;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maKM != null ? maKM.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khuyenmai)) {
            return false;
        }
        Khuyenmai other = (Khuyenmai) object;
        if ((this.maKM == null && other.maKM != null) || (this.maKM != null && !this.maKM.equals(other.maKM))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Khuyenmai[ maKM=" + maKM + " ]";
    }
    
}
