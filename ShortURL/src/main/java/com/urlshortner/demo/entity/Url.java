package com.urlshortner.demo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "url")
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String originalURL;
    @Column(nullable = false)
    private Date generateDate;
    private Date expireDate;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getOriginalURL() {
        return originalURL;
    }
    public void setOriginalURL(String originalURL) {
        this.originalURL = originalURL;
    }
    public Date getGenerateDate() {
        return generateDate;
    }
    public void setGenerateDate(Date generateDate) {
        this.generateDate = generateDate;
    }
    public Date getExpireDate() {
        return expireDate;
    }
    public void setExpiresDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}