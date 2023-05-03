package english.todo.controler;

import english.todo.messages.TaskListReq;
import english.todo.messages.TaskListResp;
import english.todo.messages.TaskReq;
import english.todo.messages.TaskResp;
import english.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/new-list")
    public void createTaskList(@RequestBody TaskListReq req) {
        taskService.createNewList(req);
    }

    @PostMapping("/create-or-update-task")
    public void createOrUpdateTask(@RequestBody TaskReq req) {
        taskService.createOrUpdateTask(req);
    }

}
