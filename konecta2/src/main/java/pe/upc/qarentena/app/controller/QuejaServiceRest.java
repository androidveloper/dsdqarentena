package pe.upc.qarentena.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pe.upc.qarentena.app.entity.CategoriaQueja;
import pe.upc.qarentena.app.service.QuejaService;
import java.util.List;

@RestController
@RequestMapping("/api/queja")
public class  QuejaServiceRest {

    @Autowired
    private QuejaService servicequeja;
    @GetMapping("/categorias")
    public List<CategoriaQueja> listarCategorias()
    {



        try {
            return servicequeja.listarcategorias();
        }
        catch (Exception e)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,   e.getMessage(), e);

        }

    }

    @PostMapping("/registrarcategoria")
    public CategoriaQueja registrar(@RequestBody CategoriaQueja categoria) {
        CategoriaQueja b;
        try {

            b = servicequeja.registrarcategoria(categoria);

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No se pudo registrar " + e.getMessage(), e);
        }
        return b;
    }

}
