package english.todo.messages;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskListResp {

    @NotEmpty
    private String name;

    private List<String> tags;

    private List<TaskResp> tasks;
}
