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
@Table(name = "QUYEN")
public class Quyen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "maQuyen")
    private String maQuyen;
    @Column(name = "tenQuyen")
    private String tenQuyen;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "maQuyen")
    private List<Taikhoan> taikhoanList;

    public Quyen() {
    }

    public Quyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    public Quyen(String maQuyen, String tenQuyen) {
        this.maQuyen = maQuyen;
        this.tenQuyen = tenQuyen;
    }

    public String getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(String maQuyen) {
        this.maQuyen = maQuyen;
    }

    public String getTenQuyen() {
        return tenQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        this.tenQuyen = tenQuyen;
    }

    
}
