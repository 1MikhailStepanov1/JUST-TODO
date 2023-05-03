package english.todo.service;

import english.todo.entity.ListEntity;
import english.todo.entity.TaskEntity;
import english.todo.exception.LoginException;
import english.todo.exception.TaskException;
import english.todo.messages.TaskListReq;
import english.todo.messages.TaskReq;
import english.todo.repository.ListRepo;
import english.todo.repository.TaskRepo;
import english.todo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class TaskService {

    @Autowired
    private LoginService loginService;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private TaskRepo taskRepo;
    @Autowired
    private ListRepo listRepo;

    public void createNewList(TaskListReq req) {
        var opt = loginService.signIn(req.getUser().getLogin(), req.getUser().getPassword());
        if (opt.isEmpty()) throw new LoginException("Auth fail");

        listRepo.save(new ListEntity(req.getName(), req.getPriority(), opt.get()));
    }

    public void createOrUpdateTask(TaskReq req) {
        var opt = loginService.signIn(req.getUser().getLogin(), req.getUser().getPassword());
        if (opt.isEmpty()) throw new LoginException("Auth fail");
        var list = listRepo.getListEntityById(req.getList());
        if (list.isEmpty()) throw new TaskException("List not found");
        if (!Objects.equals(list.get().getOwner().getId(), opt.get().getId()))
            throw new TaskException("Incorrect list id");

        var task = TaskEntity.builder()
                .name(req.getName())
                .comment(req.getComment())
                .deadline(req.getDeadline())
                .priority(req.getPriority())
                .color(req.getColor())
                .list(list.get())
                .owner(opt.get())
                .build();

        taskRepo.save(task);
    }
}
