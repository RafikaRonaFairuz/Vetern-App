package com.vetern.modal;

public class User2 {
    private String email, nama, no_tlp, password, konfr1;

    public User2(String email, String nama, String no_tlp, String password, String konfr1){
        this.email = email;
        this.nama = nama;
        this.no_tlp = no_tlp;
        this.password = password;
        this.konfr1 = konfr1;
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_tlp() {
        return no_tlp;
    }

    public String getPassword() {
        return password;
    }

    public String getKonfr1() {
        return konfr1;
    }
}