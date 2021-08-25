package demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {
    @Id
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Integer yearBorn;
    private Integer yearDeath;
    @ManyToMany
    private List<BookDefinition> writtenBooks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(Integer yearBorn) {
        this.yearBorn = yearBorn;
    }

    public Integer getYearDeath() {
        return yearDeath;
    }

    public void setYearDeath(Integer yearDeath) {
        this.yearDeath = yearDeath;
    }

    public List<BookDefinition> getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(List<BookDefinition> writtenBooks) {
        this.writtenBooks = writtenBooks;
    }
}
