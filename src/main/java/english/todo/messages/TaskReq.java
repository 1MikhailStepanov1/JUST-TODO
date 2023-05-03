package english.todo.messages;

import english.todo.entity.UserEntity;
import english.todo.entity.enums.Color;
import english.todo.entity.enums.Priority;
import english.todo.entity.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskReq {

    @NotEmpty(message = "List name can't be empty")
    @Schema
    private String name;

    private String comment;

    private Instant deadline;

    private Status status;

    private Priority priority;

    private Color color;

    @NotEmpty
    private Long list;

    @NotEmpty
    private LoginReq user;
}
