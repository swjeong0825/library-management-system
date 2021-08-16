package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class BookEntity {
    @Id
    private Integer id;
    private LocalDateTime registeredDate;
    private LocalDateTime DeletedDate;
    private boolean availability;
    @ManyToOne
    private BookDefinitionEntity bookDef;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDateTime registeredDate) {
        this.registeredDate = registeredDate;
    }

    public LocalDateTime getDeletedDate() {
        return DeletedDate;
    }

    public void setDeletedDate(LocalDateTime deletedDate) {
        DeletedDate = deletedDate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public BookDefinitionEntity getBookDef() {
        return bookDef;
    }

    public void setBookDef(BookDefinitionEntity bookDef) {
        this.bookDef = bookDef;
    }
}
