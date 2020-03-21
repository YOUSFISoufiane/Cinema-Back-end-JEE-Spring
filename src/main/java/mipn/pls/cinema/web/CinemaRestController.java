package mipn.pls.cinema.web;

import mipn.pls.cinema.dao.FilmRepository;
import mipn.pls.cinema.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class CinemaRestController {
    @Autowired
    private FilmRepository filmRepository;
    @GetMapping(value = "/imageFilm/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] image(@PathVariable(name = "id") Long id) throws IOException {
        Film f = filmRepository.findById(id).get();
        String photoName = f.getPhoto();
        File file = new File(System.getProperty("user.home")+"/Documents/imagesCINEMA/"+photoName+".jpg");
        Path path = Paths.get(file.toURI());
        return Files.readAllBytes(path);

    }
}
