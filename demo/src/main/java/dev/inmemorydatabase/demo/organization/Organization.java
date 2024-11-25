package dev.inmemorydatabase.demo.organization;

public class Organization {
    private Integer organizationId;
    private String organizationName;


    public Organization(){}

    public Organization(Integer organizationId, String organizationName) {
        this.organizationId = organizationId;
        this.organizationName = organizationName;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
