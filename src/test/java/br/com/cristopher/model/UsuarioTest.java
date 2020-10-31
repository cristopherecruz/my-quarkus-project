package br.com.cristopher.model;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.cristopher.models.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.panache.mock.PanacheMock;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class UsuarioTest {

	@Test
	public void findByIdUsuarioOptionalTest() {

		PanacheMock.mock(Usuario.class);

		Usuario u = new Usuario();
		Optional<PanacheEntityBase> usuarioOptional = Optional.of(u);

		Mockito.when(Usuario.findByIdOptional(999999999)).thenReturn(usuarioOptional);

		Assertions.assertSame(u, Usuario.findByIdOptional(999999999).get());

	}

}
