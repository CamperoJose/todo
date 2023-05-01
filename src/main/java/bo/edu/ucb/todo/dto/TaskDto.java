package bo.edu.ucb.todo.dto;

import java.util.*;

public class TaskDto {
    private Integer taskId;
    private String description;
    private Date date;
    private List<Integer> labelIds;
    private Date dateFinish;
    private Boolean isDone;

    public TaskDto() {
    }


    public Integer getTaskId() {
        return this.taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Integer> getLabelIds() {
        return this.labelIds;
    }

    public void setLabelIds(List<Integer> labelIds) {
        this.labelIds = labelIds;
    }

    public Date getDateFinish() {
        return this.dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }

    public Boolean getIsDone() {
        return this.isDone;
    }

    public void setIsDone(Boolean isDone) {
        this.isDone = isDone;
    }



    @Override
    public String toString() {
        return "{" +
            " taskId='" + getTaskId() + "'" +
            ", description='" + getDescription() + "'" +
            ", date='" + getDate() + "'" +
            ", labelIds='" + getLabelIds() + "'" +
            "}";
    }


}