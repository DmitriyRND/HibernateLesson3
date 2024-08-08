package org.example;

import org.example.Util.HibernateUtil;
import org.example.dao.UserDao;
import org.example.entity.BankAccount;
import org.example.entity.User;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        UserDao userDao = new UserDao();

        User user = new User("Вася","12345",6666);
        User user1 = new User("Anna","12345",7777);
        User user2 = new User("Jax","98765",544224);
        BankAccount bankAccount = new BankAccount(10000, LocalDate.now(),500);
        BankAccount bankAccount2 = new BankAccount(77777, LocalDate.now(),5500);
        BankAccount bankAccount3 = new BankAccount(998955, LocalDate.now(),100);

        UserDao.create(user,bankAccount);
        UserDao.create(user1,bankAccount2);
        UserDao.create(user2,bankAccount3);
        HibernateUtil.closeSessionFactory();
    }
}
