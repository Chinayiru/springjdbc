package yi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yi.dao.UserDao;
import yi.pojo.User;

import java.util.List;

@Service
public class UserServer {
//    注入dao
    @Autowired
    private UserDao userDao;

//    添加方法
    public void addUser(User user){
        userDao.add(user);

    }
}
