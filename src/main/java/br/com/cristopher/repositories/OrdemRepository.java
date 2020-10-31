package br.com.cristopher.repositories;

import javax.enterprise.context.ApplicationScoped;

import br.com.cristopher.models.Ordem;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class OrdemRepository implements PanacheRepository<Ordem> {

}
