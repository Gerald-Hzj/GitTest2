package com.offcn.model;

import javax.persistence.*;

/**
 * @author 张招雄
 * @date 2020/1/17 18:48
 */
@Entity
@Table(name="classes")
public class Class {
    @Id
    @Column(name="cls_id",length = 10)
    private String clsId;

    @Column(name="cls_name",length = 20,nullable = false)
    private String clsName;

    @Column(name="master_name",length = 20,nullable = false)
    private String masterName;

    @Column(length = 100,nullable = true)
    private String slogan;

    @Column(name="dep_id",length = 10, nullable = false)
    private String depId;

    @ManyToOne
    @JoinColumn(name = "dep_id",referencedColumnName = "dep_id", foreignKey=@ForeignKey ,insertable = false, updatable = false)
    private Department department;

    public String getClsId() {
        return clsId;
    }

    public void setClsId(String clsId) {
        this.clsId = clsId;
    }

    public String getClsName() {
        return clsName;
    }

    public void setClsName(String clsName) {
        this.clsName = clsName;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
