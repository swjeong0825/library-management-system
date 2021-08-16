package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;

@Entity
public class ViolationLogEntity {
    @Id
    private Integer id;
    private LocalDateTime createdDate;
    @ManyToOne
    private UserEntity user;
    @ManyToOne
    private ViolationEntity violation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public ViolationEntity getViolation() {
        return violation;
    }

    public void setViolation(ViolationEntity violation) {
        this.violation = violation;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
