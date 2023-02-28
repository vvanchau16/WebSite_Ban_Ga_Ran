/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BANGAAPI.entity;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "CTKM")
public class Ctkm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "maCTKM")
    private String maCTKM;
    @JoinColumn(name = "maKM", referencedColumnName = "maKM")
    @ManyToOne(optional = false)
    private Khuyenmai maKM;
    @JoinColumn(name = "maMonAn", referencedColumnName = "maMonAn")
    @ManyToOne(optional = false)
    private Monan maMonAn;

    public Ctkm() {
    }

    public Ctkm(String maCTKM) {
        this.maCTKM = maCTKM;
    }

    public String getMaCTKM() {
        return maCTKM;
    }

    public void setMaCTKM(String maCTKM) {
        this.maCTKM = maCTKM;
    }

    public Khuyenmai getMaKM() {
        return maKM;
    }

    public void setMaKM(Khuyenmai maKM) {
        this.maKM = maKM;
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
        hash += (maCTKM != null ? maCTKM.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctkm)) {
            return false;
        }
        Ctkm other = (Ctkm) object;
        if ((this.maCTKM == null && other.maCTKM != null) || (this.maCTKM != null && !this.maCTKM.equals(other.maCTKM))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Ctkm[ maCTKM=" + maCTKM + " ]";
    }
    
}
