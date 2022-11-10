package yi.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import yi.dao.UserDao;
import yi.pojo.User;

/**
 * @aythor yi
 * @data 2022/11/10  16:49:57
 * @Description
 */

@Repository
public class UserDaoImpl implements UserDao {
    //    注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into tb_user values(?,?,?)";
//        调用方法
        Object[] obj ={user.getId(), user.getUsername(), user.getPassword()};
        int update = jdbcTemplate.update(sql,obj);
        System.out.println(update);
    }
}
