package br.com.fiap.projetousuarios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario,UsuarioChaveComposta>{

	@Query(nativeQuery = true, value = "select senha from usuario where email = :emailp")
	public List<UsuarioProjection> retornaSenha(String emailp);
}
