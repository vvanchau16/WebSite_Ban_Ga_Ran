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
@Table(name = "DANHMUC")
public class Danhmuc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    
    @Column(name = "maDM")
    private String maDM;
    @Basic(optional = false)

    @Column(name = "tenDanhMuc")
    private String tenDanhMuc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maDM")
    private List<Monan> monanList;

    public Danhmuc() {
    }

    public Danhmuc(String maDM) {
        this.maDM = maDM;
    }

    public Danhmuc(String maDM, String tenDanhMuc) {
        this.maDM = maDM;
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getMaDM() {
        return maDM;
    }

    public void setMaDM(String maDM) {
        this.maDM = maDM;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }



}
