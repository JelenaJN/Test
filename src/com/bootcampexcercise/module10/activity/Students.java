package com.bootcampexcercise.module10.activity;

public class Students extends Person {

    private String schoolName;

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I study in university " + getSchoolName());
    }
}
