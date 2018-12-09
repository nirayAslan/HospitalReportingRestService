package com.spring.rest.controller;

import com.spring.rest.model.User;
import com.spring.rest.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Kullanıcı Kontrol sınıfımız.Request'i alır , servis sınıfıyla haberleşir
 * //TODO: E güvenlik nerede? Her önüne gelene response'mu dönecez?
 * //TODO: RequestMapping uzun uzun yazıyoruz bunu kısaltalım
 * @author serdar
 */

@RestController
public class UserController {
    
    @Autowired
    private UserService service;
    
    @RequestMapping(value="/users", method = RequestMethod.GET, headers="Accept=application/json")
    public List<User> getUsers(){
        List<User> response = service.getAllUsers();
        return response;
    }
    
    @RequestMapping(value="/user/{id}",method = RequestMethod.GET, headers="Accept=application/json")
    public User getUser(@PathVariable(name="id") Integer id){
        return service.getUser(id);
    }
}
