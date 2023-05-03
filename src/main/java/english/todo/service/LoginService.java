package english.todo.service;

import english.todo.entity.UserEntity;
import english.todo.exception.LoginException;
import english.todo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private UserRepo repo;

    public Optional<UserEntity> signIn(String login, char[] pass) {
        var opt = repo.findUserEntityByName(login);
        if (opt.isEmpty() || Arrays.equals(opt.get().getPass(), pass)) return Optional.empty();
        else return opt;
    }

    public void signUp(String login, char[] pass) {
        var opt = repo.findUserEntityByName(login);
        if (opt.isPresent()) throw new LoginException("A user with that name already exists");
        repo.save(new UserEntity(login, pass));
    }
}
