
package co.com.acedwdev.sms.service;

import co.com.acedwdev.sms.domain.User;
import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ImplServiceUser implements RemoteServiceUser, ServiceUser{

    @Override
    public List<User> userList() {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"Michael","Jhonson","mjhonson@mail.com","1232-5421"));
        users.add(new User(2,"Marie","Smith","msmith@mail.com","6532-1223"));
        return users;
    }

    @Override
    public User findUserById(User user) {
        return null;
    }

    @Override
    public User findUserByEmail(User user) {
        return null;
    }

    @Override
    public void registerUser(User user) {
    }

    @Override
    public void modifyUser(User user) {
    }

    @Override
    public void deleteUser(User user) {
    }
    
}
