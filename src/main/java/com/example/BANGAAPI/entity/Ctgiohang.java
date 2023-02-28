/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BANGAAPI.entity;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "CTGIOHANG")
public class Ctgiohang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)

    @Column(name = "maCTGH")
    private String maCTGH;

    @Basic(optional = false)
    @Column(name = "soLuongmon")
    private int soLuongmon;

    @JoinColumn(name = "maGioHang", referencedColumnName = "maGioHang")
    @ManyToOne(optional = false)
    private Giohang maGioHang;
    @JoinColumn(name = "maMonAn", referencedColumnName = "maMonAn")
    @ManyToOne(optional = false)
    private Monan maMonAn;

    public Ctgiohang() {
    }

    public Ctgiohang(String maCTGH) {
        this.maCTGH = maCTGH;
    }

    public Ctgiohang(String maCTGH, int soLuongmon) {
        this.maCTGH = maCTGH;
        this.soLuongmon = soLuongmon;
    }

    public String getMaCTGH() {
        return maCTGH;
    }

    public void setMaCTGH(String maCTGH) {
        this.maCTGH = maCTGH;
    }

    public int getSoLuongmon() {
        return soLuongmon;
    }

    public void setSoLuongmon(int soLuongmon) {
        this.soLuongmon = soLuongmon;
    }

    public Giohang getMaGioHang() {
        return maGioHang;
    }

    public void setMaGioHang(Giohang maGioHang) {
        this.maGioHang = maGioHang;
    }

    public Monan getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(Monan maMonAn) {
        this.maMonAn = maMonAn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCTGH != null ? maCTGH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctgiohang)) {
            return false;
        }
        Ctgiohang other = (Ctgiohang) object;
        if ((this.maCTGH == null && other.maCTGH != null) || (this.maCTGH != null && !this.maCTGH.equals(other.maCTGH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Ctgiohang[ maCTGH=" + maCTGH + " ]";
    }
    
}
