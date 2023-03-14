package english.todo.messages;

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
    enum Priority {EXTREMELY_HIGH, HIGH, AVERAGE, LOW, EXTREMELY_LOW}

    @NotEmpty
    private String name;

    private String description;

    private Instant deadline;

    private Priority priority;

    private List<String> tags;
}
