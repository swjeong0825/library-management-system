package demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
    @Id
    private Integer id;
    private String body;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
