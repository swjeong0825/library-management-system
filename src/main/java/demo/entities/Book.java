package demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Book {
    @Id
    private Integer id;
    private LocalDateTime registeredDate;
    private LocalDateTime DeletedDate;
    private boolean availability;
    @ManyToOne
    private BookDefinition bookDef;

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

    public BookDefinition getBookDef() {
        return bookDef;
    }

    public void setBookDef(BookDefinition bookDef) {
        this.bookDef = bookDef;
    }
}
