package com.example.phanvanhuan_18093581_gk;

public class Cycle {
    private int idImage;
    private String name;
    private String detail;
    private double price;


    public Cycle(int idImage, String name, String detail, double price) {
        this.idImage = idImage;
        this.name = name;
        this.detail = detail;
        this.price = price;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
