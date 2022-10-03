package company;

import company.model.User;
import company.model.somepackage.Gender;
import company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {



        User user1 = new User(1, "Bek", 25, Gender.Genderenum.MAN);
        User user2 = new User(2, "Jolaman", 28, Gender.Genderenum.MAN);
        User user3 = new User(3, "Aizhan", 32, Gender.Genderenum.WOMAN);


        try {
            UserServiceImpl impl = new UserServiceImpl();
            impl.userKoshuu(user1);
            impl.userKoshuu(user2);
            impl.userKoshuu(user3);

            System.out.println(impl.idMenenTabuu(1)+"\n");
            impl.baarynAluu();

            impl.idMenenOchuruu(2);

            System.out.println();
            impl.baarynAluu();


        }catch (RuntimeException e){
            System.out.println("Мундай id жок");
        }

    }

}