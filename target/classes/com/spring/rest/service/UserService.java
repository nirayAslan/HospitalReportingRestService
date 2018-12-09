package com.spring.rest.service;

import com.spring.rest.model.User;
import com.spring.rest.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Kullanıcı hizmet sınıfı repository sınıfından methodları yönetir.
 *
 * @author serdar
 */
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    /**
     * Tüm kullanıcıları döner.
     *
     * @return
     */
    public List<User> getAllUsers() {
        return repository.getAllUsers();
    }
    
    /**
     * id'si verilen kullanıcıyı döner.
     * @param id
     * @return 
     */
    @Transactional
    public User getUser(Integer id) {
        return repository.getUser(id);
    }

}
