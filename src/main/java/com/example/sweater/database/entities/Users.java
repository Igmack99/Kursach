package com.example.sweater.database.entities;


import javax.persistence.*;

/**
 * Класс, отображающий сущность User(Пользователь)
 */
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String username;
    private String usersurname;
    @Column(unique = true)
    private String userlogin;
    private String usercountry;
    private String userpassword;
    private boolean isBanned;
    private Integer userage;
    @Column(unique = true)
    private String useremail;
    private Integer userbalance;


    public Users(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @param username Имя пользователя
     * @param usersurname Фамилия пользоватля
     * @param userlogin Логин пользователя
     * @param userpassword Пароль пользователя
     * @param usercountry Страна Рождения ползователя
     * @param userage Возраст пользователя
     * @param useremail почта пользователя
     * @param userbalance баланс пользователя
     * @param isBanned забанен пользователь или нет
     */
    public Users(String username, String usersurname, String userlogin, String userpassword, boolean isBanned, String usercountry, Integer userage, String useremail, Integer userbalance) {
        this.username = username;
        this.usersurname = usersurname;
        this.userlogin = userlogin;
        this.usercountry = usercountry;
        this.userpassword = userpassword;
        this.userage = userage;
        this.useremail = useremail;
        this.userbalance = userbalance;
        this.isBanned = isBanned;
}

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getUsersurname() { return usersurname; }

    public void setUsersurname(String usersurname) {this.usersurname = usersurname;}

    public String getUserlogin() { return userlogin; }

    public void setUserlogin(String userlogin) {this.userlogin = userlogin;}

    public String getUserpassword() { return userpassword; }

    public void setUserpassword(String userpassword) {this.userpassword = userpassword;}

    public boolean getisBanned() { return isBanned; }

    public void setisBanned(boolean isBanned) {this.isBanned = isBanned;}

    public String getUsercountry() { return usercountry; }

    public void setUsercountry(String usercountry) {this.usercountry = usercountry;}

    public Integer getUserage() { return userage; }

    public void setUserage(Integer userage) {this.userage = userage;}

    public String getUseremail() { return useremail; }

    public void setUseremail(String useremail) {this.useremail = useremail;}

    public Integer getUserbalance() { return userbalance; }

    public void setUserbalance(Integer userbalance) {this.userbalance = userbalance;}

}
