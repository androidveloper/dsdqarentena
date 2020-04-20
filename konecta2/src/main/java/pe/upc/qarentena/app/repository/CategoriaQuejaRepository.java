package pe.upc.qarentena.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.upc.qarentena.app.entity.CategoriaQueja;

public interface CategoriaQuejaRepository extends JpaRepository<CategoriaQueja, Long> {

    @Query("select a from CategoriaQueja a where a.codigo = :codigo")
    public List<CategoriaQueja> listarCategoriaQuejas(@Param("codigo") Long codigo);



}
