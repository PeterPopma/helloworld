package nl.peterpopma.helloworld;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GreetingEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String message;

    public GreetingEntity(String message) {
        this.message = message;
    }

    public GreetingEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
