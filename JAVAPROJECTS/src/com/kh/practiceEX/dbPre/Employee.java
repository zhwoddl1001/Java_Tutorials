package com.kh.practiceEX.dbPre;

import java.util.Date;

public class Employee {
    // 추후 DB 컬럼명과 연결할 자바 변수명으로 DB와 자바변수명과 일치시켜주는 것이 좋음
    private String emp_id;    //    EMP_ID	VARCHAR2(3 BYTE)
    private String emp_name;  //    EMP_NAME	VARCHAR2(20 BYTE)
    private String emp_no;    //    EMP_NO	CHAR(14 BYTE) -> char(14 byte) 한글자씩 총 14까지 작성 허용
    private String email;     //    EMAIL	VARCHAR2(25 BYTE)
    private String phone;     //    PHONE	VARCHAR2(12 BYTE)
    private String dept_code; //    DEPT_CODE	CHAR(2 BYTE)
    private String jop_code;  //    JOB_CODE	CHAR(2 BYTE)
    private String sal_level; //    SAL_LEVEL	CHAR(2 BYTE)
    private double salary;    //    SALARY	NUMBER (정수와 실수)
    private double bonus;     //    BONUS	NUMBER
    private String manager_id;//    MANAGER_ID	VARCHAR2(3 BYTE)
    private Date hire_date;   //    HIRE_DATE	DATE
    private String ent_date;  //    ENT_DATE	DATE
    private char ent_yn;      //    ENT_YN	CHAR(1 BYTE)

    public Employee() {
    }

    public Employee(String emp_id, String emp_name, String emp_no, String email, String phone, String dept_code, String jop_code, String sal_level, double salary, double bonus, String manager_id, Date hire_date, String ent_date, char ent_yn) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_no = emp_no;
        this.email = email;
        this.phone = phone;
        this.dept_code = dept_code;
        this.jop_code = jop_code;
        this.sal_level = sal_level;
        this.salary = salary;
        this.bonus = bonus;
        this.manager_id = manager_id;
        this.hire_date = hire_date;
        this.ent_date = ent_date;
        this.ent_yn = ent_yn;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code;
    }

    public String getJop_code() {
        return jop_code;
    }

    public void setJop_code(String jop_code) {
        this.jop_code = jop_code;
    }

    public String getSal_level() {
        return sal_level;
    }

    public void setSal_level(String sal_level) {
        this.sal_level = sal_level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public String getEnt_date() {
        return ent_date;
    }

    public void setEnt_date(String ent_date) {
        this.ent_date = ent_date;
    }

    public char getEnt_yn() {
        return ent_yn;
    }

    public void setEnt_yn(char ent_yn) {
        this.ent_yn = ent_yn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id='" + emp_id + '\'' +
                ", emp_name='" + emp_name + '\'' +
                ", emp_no='" + emp_no + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", dept_code='" + dept_code + '\'' +
                ", jop_code='" + jop_code + '\'' +
                ", sal_level='" + sal_level + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", manager_id='" + manager_id + '\'' +
                ", hire_date=" + hire_date +
                ", ent_date='" + ent_date + '\'' +
                ", ent_yn=" + ent_yn +
                '}';
    }
}
