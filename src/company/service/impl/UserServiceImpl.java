package company.service.impl;

import company.dao.UserDao;
import company.model.User;
import company.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserDao  userDao = new UserDao();


    @Override
    public void userKoshuu(User user) {

        userDao.getUsers().add(user);

    }


    @Override
    public User idMenenTabuu(int id) {

        return userDao.getUsers().
                stream().filter( user -> user.getId() == id).
                findFirst().
                orElseThrow(() -> new RuntimeException());

    }


    @Override
    public User idMenenOchuruu(int id) {

        User useer = new User();
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if(userDao.getUsers().get(i).getId() == id){
                useer = userDao.getUsers().remove(i);
            }
        }return useer;

    }


    @Override
    public void baarynAluu() {
        for (User u : userDao.getUsers()) {
            System.out.println(u);
        }
    }
}