
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
@Table(name = "Yarisma")
public class Yarisma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Kullanici olusturan;

    @Column(nullable = false)
    private LocalDateTime baslangicTarihi;

    @Column(nullable = false)
    private LocalDateTime bitisTarihi;

    @Column(nullable = false)
    private String odul;

    @Column(nullable = false)
    private int katilimciSayisi;

    public Yarisma() {
    }

    public Yarisma(Kullanici olusturan, LocalDateTime baslangicTarihi, LocalDateTime bitisTarihi, String odul, int katilimciSayisi) {
        this.olusturan = olusturan;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.odul = odul;
        this.katilimciSayisi = katilimciSayisi;
    }
    
    

    public Yarisma(Long id, Kullanici olusturan, LocalDateTime baslangicTarihi, LocalDateTime bitisTarihi, String odul, int katilimciSayisi) {
        this.id = id;
        this.olusturan = olusturan;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.odul = odul;
        this.katilimciSayisi = katilimciSayisi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kullanici getOlusturan() {
        return olusturan;
    }

    public void setOlusturan(Kullanici olusturan) {
        this.olusturan = olusturan;
    }

    public LocalDateTime getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(LocalDateTime baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public LocalDateTime getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(LocalDateTime bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public String getOdul() {
        return odul;
    }

    public void setOdul(String odul) {
        this.odul = odul;
    }

    public int getKatilimciSayisi() {
        return katilimciSayisi;
    }

    public void setKatilimciSayisi(int katilimciSayisi) {
        this.katilimciSayisi = katilimciSayisi;
    }

    @Override
    public String toString() {
        return "Yarisma{" + "id=" + id + ", olusturan=" + olusturan + ", baslangicTarihi=" + baslangicTarihi + ", bitisTarihi=" + bitisTarihi + ", odul=" + odul + ", katilimciSayisi=" + katilimciSayisi + '}';
    }

    
    
    
}