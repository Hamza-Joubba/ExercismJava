import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(this.languages.size() == 0)
            return true;
        else
            return false;
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }

    public void removeLanguage(String language) {
        this.languages.remove(language);
    }

    public String firstLanguage() {
        return this.languages.get(0);
    }

    public int count() {
        return this.languages.size();
    }

    public boolean containsLanguage(String language) {
        if(this.languages.contains(language))
            return true;
        else
            return false;
    }

    public boolean isExciting() {
        if(this.languages.contains("Java") || this.languages.contains("Kotlin"))
            return true;
        else
            return false;
    }
}
