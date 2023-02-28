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

@Entity
@Table(name = "NHANVIEN")
public class Nhanvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maNV")
    private String maNV;

    @Basic(optional = false)
    @Column(name = "hoNV")
    private String hoNV;

    @Basic(optional = false)
    @Column(name = "tenNV")
    private String tenNV;

    @Basic(optional = false)
    @Column(name = "gioiTinh")
    private boolean gioiTinh;

    @Basic(optional = false)
    @Column(name = "CCCD")
    private long cccd;

    @Basic(optional = false)
    @Column(name = "ngaySinh")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ngaySinh;

    @Basic(optional = false)
    @Column(name = "SDT")
    private String sdt;

    @Column(name = "diaChi")
    private String diaChi;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maNV")
    private List<Khuyenmai> khuyenmaiList;

    @JoinColumn(name = "tenDN", referencedColumnName = "tenDN")
    @OneToOne(optional = false)
    private Taikhoan tenDN;

    public Nhanvien() {
    }

    public Nhanvien(String maNV) {
        this.maNV = maNV;
    }

    public Nhanvien(String maNV, String hoNV, String tenNV, boolean gioiTinh, long cccd, Date ngaySinh, String sdt) {
        this.maNV = maNV;
        this.hoNV = hoNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.cccd = cccd;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoNV() {
        return hoNV;
    }

    public void setHoNV(String hoNV) {
        this.hoNV = hoNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public long getCccd() {
        return cccd;
    }

    public void setCccd(long cccd) {
        this.cccd = cccd;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maNV != null ? maNV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nhanvien)) {
            return false;
        }
        Nhanvien other = (Nhanvien) object;
        if ((this.maNV == null && other.maNV != null) || (this.maNV != null && !this.maNV.equals(other.maNV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Nhanvien[ maNV=" + maNV + " ]";
    }
    
}
