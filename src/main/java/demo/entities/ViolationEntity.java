package demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ViolationEntity {
    @Id
    private Integer id;
    private String title;
    private String penalty;

    @OneToMany
    private List<ViolationLogEntity> violationLogs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public List<ViolationLogEntity> getViolationLogs() {
        return violationLogs;
    }

    public void setViolationLogs(List<ViolationLogEntity> violationLogs) {
        this.violationLogs = violationLogs;
    }




}
