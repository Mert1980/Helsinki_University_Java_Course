
import java.util.ArrayList;
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
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    // adds the translation for the word and preserves the old translations.
    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());
        this.translations.get(word).add(translation);
    }

    //returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.
    public ArrayList<String> translate(String word) {
        return translations.getOrDefault(word, new ArrayList<>());
    }

    // removes the word and all its translations from the dictionary.
    public void remove(String word) {
        this.translations.remove(word);
    }
}
