package com.offcn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author  张招雄
 */

@Entity
@Table(name="departments")
public class Department {
    @Id
    @Column(name="dep_id",length = 10)
    private String depId;

    @Column(name="dep_name",length = 20,nullable = false)
    private String depName;

    @Column(name="master_name",length = 20,nullable = false)
    private String masterName;

    @Column(length = 100,nullable = true)
    private String slogan;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
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
}
