package com.offcn.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author 张招雄
 * @date 2020/1/17 18:48
 */
@Entity
@Table(name="students")
public class Student {
    @Id
    @Column(name="stu_id",length = 10)
    private String stuId;

    @Column(name="stu_name",length = 20,nullable = false)
    private String stuName;

    @Column(name="gender",nullable = false)
    private boolean gender;

    @Column(name="birthday",nullable = false)
    private Date birthday;

    @Column(name="native", length = 20, nullable = false)
    private String nativePlace;

    @Column(name="phone_number",length = 20)
    private String phoneNumber;

    @Column(name="address",length = 100)
    private String address;

    @Column(name="zipcode",length = 8)
    private String zipcode;

    @Column(name="email",length = 20)
    private String email;

    @Column(name="note",length = 200)
    private String note;

    @Column(name="cls_id",length = 10, nullable = false)
    private String clsId;

    @Column(name="dep_id",length = 10, nullable = false)
    private String depId;

    @ManyToOne
    @JoinColumn(name = "dep_id",referencedColumnName = "dep_id", foreignKey=@ForeignKey ,insertable = false, updatable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "cls_id",referencedColumnName = "cls_id", foreignKey=@ForeignKey ,insertable = false, updatable = false)
    private Class aClass;
}
