package com.wellsfargo.counselor.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long PortfolioId;
    @GeneratedValue()
    private long ClientId;

    @Column(nullable = false)
    private String CreationDate;

    protected Portfolio() {

    }

    public Portfolio(long ClientId, String CreationDate) {
        this.ClientId = ClientId;
        this.CreationDate= CreationDate;
    }

    public Long getPortfolioId() {
        return PortfolioId;
    }

    public long getClientId() {
        return ClientId;
    }

    public void setClintId(long ClientId) {
        this.ClientId = ClientId;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

}
