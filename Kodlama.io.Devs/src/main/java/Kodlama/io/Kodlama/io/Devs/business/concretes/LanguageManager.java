package Kodlama.io.Kodlama.io.Devs.business.concretes;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository){
        this.languageRepository=languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void addLanguage(Language language) throws Exception {
        if (language.getName()==""){
            throw  new Exception("Name cannot be empty");
        }
        for (Language lang : getAll()){
            if (lang.getName()==language.getName()){
                throw new Exception("Name cannot be repeated");
            }
        }
        languageRepository.add(language);
    }

    @Override
    public void deleteLanguage(int id) {

        languageRepository.delete(id);

    }

    @Override
    public void updateLanguage(int id, Language language) throws Exception {
        if (language.getName()==""){
            throw  new Exception("Name cannot be empty");
        }
        for (Language lang : getAll()){
            if (lang.getName()==language.getName()){
                throw new Exception("Name cannot be repeated");
            }
        }
        languageRepository.update(id, language);

    }

    @Override
    public Language getLanguageById(int id) {
        return languageRepository.getById(id);
    }
}
