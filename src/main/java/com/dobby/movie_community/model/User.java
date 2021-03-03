package com.dobby.movie_community.model;

public class User {
//    private Long uid; // Number (시퀀스 : 자동 증가)
    private String user_id; // VARCHAR2(50)
    private String user_password; // VARCHAR2(50)
    private String user_gender; // CHAR(1)
    private String user_name; // VARCHAR2(50)
    private String user_email; // VARCHAR2(50)
    private String user_address; // VARCHAR2(200)
    private String user_birth; // DATE
    private String user_phone; // VARCHAR2(50)

//    public Long getUid() {
//        return uid;
//    }
//
//    public void setUid(Long uid) {
//        this.uid = uid;
//    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(String user_birth) {
        this.user_birth = user_birth;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_address='" + user_address + '\'' +
                ", user_birth='" + user_birth + '\'' +
                ", user_phone='" + user_phone + '\'' +
                '}';
    }
}
