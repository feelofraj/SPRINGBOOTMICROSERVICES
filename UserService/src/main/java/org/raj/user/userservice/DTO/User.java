package org.raj.user.userservice.DTO;

import javax.persistence.*;

@Entity
@Table(name = "app.user")
public class User {

    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "user_name")
    private String name;
    private String gender;
    private int age;
    private String city;
    private long dept_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getDept_id() {
        return dept_id;
    }

    public void setDept_id(long dept_id) {
        this.dept_id = dept_id;
    }
}
