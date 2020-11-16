
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mertdemirok
 */
public class Abbreviations {

    private HashMap<String, String> directory;
    private String abbreviation;
    private String explanation;

    public Abbreviations() {
        this.directory = new HashMap<>();
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.directory.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.directory.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.directory.get(abbreviation);
    }
}
