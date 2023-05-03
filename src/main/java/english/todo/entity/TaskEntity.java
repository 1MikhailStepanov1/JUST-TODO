package english.todo.entity;

import english.todo.entity.enums.Color;
import english.todo.entity.enums.Priority;
import english.todo.entity.enums.Status;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
@Builder
@Table(name = "tasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "comment")
    private String comment;

    @Column(name = "deadline")
    private Instant deadline;

    @Column(name = "status")
    private Status status;

    @Column(name = "priority")
    private Priority priority;

    @Column(name = "color")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity owner;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private ListEntity list;
}
