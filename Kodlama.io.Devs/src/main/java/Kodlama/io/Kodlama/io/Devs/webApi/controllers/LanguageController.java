package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private LanguageService languageService;

    @Autowired
    public  LanguageController(LanguageService languageService){
        this.languageService=languageService;
    }
    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Language language) throws Exception{
        languageService.addLanguage(language);
    }
    @PostMapping("/update")
    public void update(@RequestBody Language language) throws Exception{
        languageService.updateLanguage(language.getId(),language);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Language language) {
        languageService.deleteLanguage(language.getId());
    }

    @GetMapping("get/{id}")
    public Language getId(@PathVariable int id){
        return languageService.getLanguageById(id);
    }
}
