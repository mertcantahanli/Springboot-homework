package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface LanguageRepository {

    List<Language> getAll();

    void add(Language language);

    void delete(int id);

    Language update(int id, Language language);

    Language getById(int id);

}
