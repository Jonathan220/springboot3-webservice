package br.com.jonathan.webservice.repositories;

import br.com.jonathan.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
