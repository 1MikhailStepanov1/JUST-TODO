package english.todo.messages;

import english.todo.entity.enums.Priority;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskResp {
    @NotEmpty
    private String name;

    private String description;

    private Instant deadline;

    private Priority priority;
}
