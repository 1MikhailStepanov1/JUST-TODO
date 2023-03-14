package english.todo.controler;

import english.todo.messages.TaskListReq;
import english.todo.messages.TaskListResp;
import english.todo.messages.TaskResp;
import org.springframework.web.bind.annotation.*;

@RestController("/tasks")
public class TaskController {

    @PostMapping("/new-list")
    public void createTaskList(@RequestBody TaskListReq req) {

    }

    @PostMapping("/create-or-update-task")
    public void createOrUpdateTask() {

    }

    @PostMapping("/change-status")
    public void changeTaskStatus() {

    }

    @GetMapping("/task/{id}")
    public TaskResp getTaskById(@PathVariable String id) {
        return null;
    }

    @GetMapping("/list/{id}")
    public TaskListResp getListById(@PathVariable String id) {
        return null;
    }

}
