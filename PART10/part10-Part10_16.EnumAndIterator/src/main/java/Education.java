/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mertdemirok
 */
public enum Education {
    PHD("Doctoral Degree"),
    MA("Masters Degree"),
    BA("Bachelors Degree"),
    HS("High School Diploma");

    private String degree;

    private Education(String degree) {
        this.degree = degree;
    }

    public String getName() {
        return this.degree;
    }

}
