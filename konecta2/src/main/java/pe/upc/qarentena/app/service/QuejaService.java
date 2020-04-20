package pe.upc.qarentena.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.upc.qarentena.app.entity.CategoriaQueja;
import pe.upc.qarentena.app.repository.CategoriaQuejaRepository;

import java.util.List;

@Service
public class QuejaService {
    @Autowired
    private CategoriaQuejaRepository quejarepositorio;

    public List<CategoriaQueja> listarcategorias() {
        return quejarepositorio.findAll();

    }
    public CategoriaQueja registrarcategoria(CategoriaQueja categoria) {

        return quejarepositorio.save(categoria);

    }

}       
