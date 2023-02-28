/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.BANGAAPI.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "CTGIA")
public class Ctgia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idCTG")
    private Long idCTG;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
   
    @Column(name = "soTien")
    private BigDecimal soTien;
    @Basic(optional = false)
   
    @Column(name = "ngayApDung")
    @Temporal(TemporalType.DATE)
    private Date ngayApDung;
    @JoinColumn(name = "maMonAn", referencedColumnName = "maMonAn")
    @ManyToOne(optional = false)
    private Monan maMonAn;

    public Ctgia() {
    }

    public Ctgia(Long idCTG) {
        this.idCTG = idCTG;
    }

    public Ctgia(Long idCTG, BigDecimal soTien, Date ngayApDung) {
        this.idCTG = idCTG;
        this.soTien = soTien;
        this.ngayApDung = ngayApDung;
    }

    public Long getIdCTG() {
        return idCTG;
    }

    public void setIdCTG(Long idCTG) {
        this.idCTG = idCTG;
    }

    public BigDecimal getSoTien() {
        return soTien;
    }

    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
    }

    public Date getNgayApDung() {
        return ngayApDung;
    }

    public void setNgayApDung(Date ngayApDung) {
        this.ngayApDung = ngayApDung;
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
        hash += (idCTG != null ? idCTG.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ctgia)) {
            return false;
        }
        Ctgia other = (Ctgia) object;
        if ((this.idCTG == null && other.idCTG != null) || (this.idCTG != null && !this.idCTG.equals(other.idCTG))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enitty.Ctgia[ idCTG=" + idCTG + " ]";
    }
    
}
