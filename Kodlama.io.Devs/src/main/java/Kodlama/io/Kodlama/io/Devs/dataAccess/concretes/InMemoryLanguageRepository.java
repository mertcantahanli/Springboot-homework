package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository(){
        languages= new ArrayList<Language>();

        languages.add(new Language(1,"phyton"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"java"));

    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void add(Language language) {

        languages.add(language);
    }

    @Override
    public void delete(int id) {

        languages.remove(id);
    }

    @Override
    public Language update(int id, Language language) {

        languages.set(id, language);

        return language;
    }

    @Override
    public Language getById(int id) {
        languages.get(id);
        return null;
    }
}
