package desafioApiRest.domain.Service.Implement;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import desafioApiRest.domain.Service.UserService;
import desafioApiRest.domain.Service.Repository.UserRepository;
import desafioApiRest.domain.model.User;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account Number ready exists");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

}
