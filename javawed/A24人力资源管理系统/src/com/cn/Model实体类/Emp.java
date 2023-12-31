package com.cn.Model实体类;


import java.util.Date;
public class Emp {


    public Emp() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", sal=" + sal +
                ", birthday=" + birthday +
                ", edate=" + edate +
                ", district=" + district +
                ", districtId=" + districtId +
                '}';
    }

    public Emp(Integer id, String ename, Integer age, Integer sex, Double sal, Date birthday, Date edate, District district, Integer districtId) {
        this.id = id;
        this.ename = ename;
        this.age = age;
        this.sex = sex;
        this.sal = sal;
        this.birthday = birthday;
        this.edate = edate;
        this.district = district;
        this.districtId = districtId;
    }

    public Emp(Integer id, String ename, Integer age, Integer sex, Double sal, Date birthday, Date edate, Integer districtId) {
        this.id = id;
        this.ename = ename;
        this.age = age;
        this.sex = sex;
        this.sal = sal;
        this.birthday = birthday;
        this.edate = edate;
        this.districtId = districtId;
    }

    // 主键
    private Integer id;

    // 员工名称
    private String ename;
    // 年龄
    private Integer age;
    // 性别
    private Integer sex;
    // 工资
    private Double sal;
    // 生日
    private Date birthday;
    // 入职日期
    private Date edate;

    // 地区
    private District district;

    // 地区ID
    private Integer districtId;









}
