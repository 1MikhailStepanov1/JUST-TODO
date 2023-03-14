package english.todo.messages;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginReq {
    @Email
    @NotEmpty(message = "Login is required")
    @Schema
    private String login;

    @NotEmpty(message = "Password is required")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$",
            message = "Password doesn't meet all requirements ")
    @Size(min = 8, message = "password should have at least 8 characters")
    @Schema
    private String password;

}
