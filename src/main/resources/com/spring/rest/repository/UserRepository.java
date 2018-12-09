package com.spring.rest.repository;

import com.spring.rest.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * Kullanıcılar için veritabanı erişim sınıfıdır (UserDao.java diye de
 * isimlendirebilirdik)
 *
 * @author serdar
 */

@Repository
public class UserRepository {
    
    @Autowired
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
    
    /**
     * Veritabanındaki tüm kullanıcıları listeler
     * @return 
     */
    public List<User> getAllUsers(){
        List<User> users = getTemplate().loadAll(User.class);
        return users;
    }
    
    /**
     * verilen id'ye göre veritabanından kullanıcıyı çeker
     * @return
     */
    public User getUser(Integer id){
        User user = getTemplate().get(User.class, id);
        return user;
    }
}
