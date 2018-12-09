package com.spring.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

/**
 * Kullanıcı Model Sınıfı
 * 
 * @author Serdar Mutlu
 * @version 0.0.1
 * 
 */
@Entity
@Table(name="uyeler")
@Component
public class User {
    
    @Id
    @Column(name="uye_id")
    private Integer id;
    
    @Column(name="dosya_no")
    private String fileId;
    
    @Column(name="tc_no")
    private String tcId;
    
    @Column(name="ad_soyad")
    private String name;
    
    @Column(name="kan_grubu")
    private String blood;
    
    @Column(name="adres")
    private String address;

    public User() {
    }

    public User(Integer id, String fileId, String tcId, String name, String blood, String address) {
        this.id = id;
        this.fileId = fileId;
        this.tcId = tcId;
        this.name = name;
        this.blood = blood;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getTcId() {
        return tcId;
    }

    public void setTcId(String tcId) {
        this.tcId = tcId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
