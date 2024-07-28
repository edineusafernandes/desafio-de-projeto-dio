package desafioApiRest.domain.Service;

import org.springframework.stereotype.Service;

import desafioApiRest.domain.model.User;

@Service
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
