package english.todo.controler;

import english.todo.messages.LoginReq;
import english.todo.service.LoginService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthController {

    @Autowired
    private LoginService service;

    @PostMapping("sign-in")
    public void signIn(@Valid @RequestBody LoginReq req) {
        service.signIn(req.getLogin(), req.getPassword());
    }

    @PostMapping("sign-up")
    public void signUp(@Valid @RequestBody LoginReq req) {
        service.signUp(req.getLogin(), req.getPassword());
    }


}
