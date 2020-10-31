package br.com.cristopher.repositories;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.cristopher.models.Ordem;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;

@QuarkusTest
public class OrdemRepositoryTest {

	@InjectMock
	OrdemRepository ordemRepository;
	
	@Test
	public void listAllOrdensTest() {
		
		Ordem ordem1 = new Ordem();
		Ordem ordem2 = new Ordem();
		
		List<Ordem> ordens = new ArrayList<Ordem>();
		ordens.add(ordem1);
		ordens.add(ordem2);
		
		Mockito.when(ordemRepository.listAll()).thenReturn(ordens);
		
		Assertions.assertSame(ordem2, ordemRepository.listAll().get(1));
		
	}
	
}
