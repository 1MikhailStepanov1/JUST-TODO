package english.todo.controler;

import english.todo.messages.LoginReq;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthController {

    @PostMapping("sign-in")
    public void signIn(@Valid @RequestBody LoginReq req) {

    }

    @PostMapping("sign-up")
    public void signUp(@Valid @RequestBody LoginReq req) {

    }


}
