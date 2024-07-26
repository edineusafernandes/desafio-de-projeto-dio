package desafioApiRest.domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import desafioApiRest.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
