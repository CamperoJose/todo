package bo.edu.ucb.todo.dto;

public  class LabelDto {
    private Integer labelId;
    private String name;
    private Boolean deleted;

    public LabelDto() {
    }

    public LabelDto(Integer labelId, String name, Boolean deleted) {
        this.labelId = labelId;
        this.name = name;
        this.deleted = deleted;
    }

    public Integer getLabelId() {
        return this.labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isDeleted() {
        return this.deleted;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "{" +
            " labelId='" + getLabelId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

}