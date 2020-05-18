package com.example.mvcmodel.Model;

public class Department {
    public int depId;
    public String managerName;
    public String deptName;

    public Department(int depId, String managerName, String deptName) {
        this.depId = depId;
        this.managerName = managerName;
        this.deptName = deptName;
    }
    public Department(){}

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
