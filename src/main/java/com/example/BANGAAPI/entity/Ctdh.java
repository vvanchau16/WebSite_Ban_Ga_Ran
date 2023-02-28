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
import java.util.List;


/**
 *
 * @author ACER
 */
@Entity
@Table(name = "CTDH")
public class Ctdh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idCTDH")
    private Long idCTDH;
    @Basic(optional = false)
    
    @Column(name = "soLuong")
    private int soLuong;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    
    @Column(name = "giaMonAn")
    private BigDecimal giaMonAn;
    @JoinColumn(name = "maDH", referencedColumnName = "maDH")
    @ManyToOne(optional = false)
    private Donhang maDH;
    @JoinColumn(name = "maMonAn", referencedColumnName = "maMonAn")
    @ManyToOne(optional = false)
    private Monan maMonAn;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ctdh")
    private List<Ctdanhgia> ctdanhgiaList;

    public Ctdh() {
    }

    public Ctdh(Long idCTDH) {
        this.idCTDH = idCTDH;
    }

    public Ctdh(Long idCTDH, int soLuong, BigDecimal giaMonAn) {
        this.idCTDH = idCTDH;
        this.soLuong = soLuong;
        this.giaMonAn = giaMonAn;
    }

    public Long getIdCTDH() {
        return idCTDH;
    }

    public void setIdCTDH(Long idCTDH) {
        this.idCTDH = idCTDH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGiaMonAn() {
        return giaMonAn;
    }

    public void setGiaMonAn(BigDecimal giaMonAn) {
        this.giaMonAn = giaMonAn;
    }

    public Donhang getMaDH() {
        return maDH;
    }

    public void setMaDH(Donhang maDH) {
        this.maDH = maDH;
    }

    public Monan getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(Monan maMonAn) {
        this.maMonAn = maMonAn;
    }

    public List<Ctdanhgia> getCtdanhgiaList() {
        return ctdanhgiaList;
    }

    public void setCtdanhgiaList(List<Ctdanhgia> ctdanhgiaList) {
        this.ctdanhgiaList = ctdanhgiaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCTDH != null ? idCTDH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctdh)) {
            return false;
        }
        Ctdh other = (Ctdh) object;
        if ((this.idCTDH == null && other.idCTDH != null) || (this.idCTDH != null && !this.idCTDH.equals(other.idCTDH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Ctdh[ idCTDH=" + idCTDH + " ]";
    }
    
}
