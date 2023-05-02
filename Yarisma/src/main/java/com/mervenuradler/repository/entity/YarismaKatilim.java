
package com.mervenuradler.repository.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "YarismaKatilim")
public class YarismaKatilim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Kullanici katilan;

    @ManyToOne
    private Yarisma yarisma;

    @Column(nullable = false)
    private LocalDateTime katilimTarihi;

    public YarismaKatilim() {
    }

    public YarismaKatilim(Kullanici katilan, Yarisma yarisma, LocalDateTime katilimTarihi) {
        this.katilan = katilan;
        this.yarisma = yarisma;
        this.katilimTarihi = katilimTarihi;
    }

    public YarismaKatilim(Long id, Kullanici katilan, Yarisma yarisma, LocalDateTime katilimTarihi) {
        this.id = id;
        this.katilan = katilan;
        this.yarisma = yarisma;
        this.katilimTarihi = katilimTarihi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kullanici getKatilan() {
        return katilan;
    }

    public void setKatilan(Kullanici katilan) {
        this.katilan = katilan;
    }

    public Yarisma getYarisma() {
        return yarisma;
    }

    public void setYarisma(Yarisma yarisma) {
        this.yarisma = yarisma;
    }

    public LocalDateTime getKatilimTarihi() {
        return katilimTarihi;
    }

    public void setKatilimTarihi(LocalDateTime katilimTarihi) {
        this.katilimTarihi = katilimTarihi;
    }

    @Override
    public String toString() {
        return "YarismaKatilim{" + "id=" + id + ", katilan=" + katilan + ", yarisma=" + yarisma + ", katilimTarihi=" + katilimTarihi + '}';
    }

   
    
    
    
    
    
    
    
    
    
    
}
