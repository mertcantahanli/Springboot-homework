package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {

    List<Language> getAll();

    void addLanguage(Language language) throws Exception;

    void deleteLanguage(int id);

    void updateLanguage(int id, Language language) throws Exception;

    Language getLanguageById(int id);
}
