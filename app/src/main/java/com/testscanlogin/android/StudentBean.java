package com.testscanlogin.android;

import cn.bmob.v3.BmobObject;

/**
 * Created by www10 on 2017/3/30.
 */

public class StudentBean extends BmobObject {
    private Integer studentId;
    private Integer studentPassword;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(Integer studentPassword) {
        this.studentPassword = studentPassword;
    }
}
