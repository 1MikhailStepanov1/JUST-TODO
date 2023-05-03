package english.todo.entity;

import english.todo.entity.enums.Priority;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "lists")
public class ListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "priority")
    private Priority priority;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity owner;

    public ListEntity(String name, Priority priority, UserEntity owner) {
        this.name = name;
        this.priority = priority;
        this.owner = owner;
    }
}
