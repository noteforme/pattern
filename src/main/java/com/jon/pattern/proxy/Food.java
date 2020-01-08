package com.jon.pattern.proxy;

public class Food  {
    private String spicy;
    private String salt;
    private String chicken;

    private String noodle;
    private String condiment;

    public String getCondiment() {
        return condiment;
    }

    public void addCondiment(String condiment) {
        this.condiment = condiment;
    }

    public String getNoodle() {
        return noodle;
    }

    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getSpicy() {
        return spicy;
    }

    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
