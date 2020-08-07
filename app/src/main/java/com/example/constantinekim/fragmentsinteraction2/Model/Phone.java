package com.example.constantinekim.fragmentsinteraction2.Model;

public class Phone {
    private String modelName;
    private String companyName;
    private int image;

    public Phone(String modelName, String companyName, int image) {
        this.modelName = modelName;
        this.companyName = companyName;
        this.image = image;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
