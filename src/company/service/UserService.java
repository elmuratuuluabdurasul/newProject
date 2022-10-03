package company.service;


import company.model.User;

public interface UserService  {


    void userKoshuu(User user);

    User idMenenTabuu( int id);

    User idMenenOchuruu(int id);
    void baarynAluu();


}