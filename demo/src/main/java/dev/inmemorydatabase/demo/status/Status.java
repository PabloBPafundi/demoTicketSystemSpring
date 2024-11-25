package dev.inmemorydatabase.demo.status;

public class Status {

    private Integer statusId;
    private String statusName;


    public Status(){}

    public Status(String statusName, Integer statusId) {
        this.statusName = statusName;
        this.statusId = statusId;
    }


    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }
}

