package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class UserEntity {
    @Id
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Integer borrowLimit;
    private LocalDateTime registeredDate;
    private LocalDateTime deletedDate;

    @OneToMany
    private List<BorrowingLogEntity> borrowingLogs;

    @OneToMany
    private List<ViolationLogEntity> violationLogs;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBorrowLimit() {
        return borrowLimit;
    }

    public void setBorrowLimit(Integer borrowLimit) {
        this.borrowLimit = borrowLimit;
    }

    public LocalDateTime getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDateTime registeredDate) {
        this.registeredDate = registeredDate;
    }

    public LocalDateTime getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(LocalDateTime deletedDate) {
        this.deletedDate = deletedDate;
    }

    public List<BorrowingLogEntity> getBorrowingLogs() {
        return borrowingLogs;
    }

    public void setBorrowingLogs(List<BorrowingLogEntity> borrowingLogs) {
        this.borrowingLogs = borrowingLogs;
    }

    public List<ViolationLogEntity> getViolationLogs() {
        return violationLogs;
    }

    public void setViolationLogs(List<ViolationLogEntity> violationLogs) {
        this.violationLogs = violationLogs;
    }


}
