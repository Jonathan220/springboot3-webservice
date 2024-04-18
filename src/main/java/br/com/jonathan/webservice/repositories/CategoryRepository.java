package br.com.jonathan.webservice.repositories;

import br.com.jonathan.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
