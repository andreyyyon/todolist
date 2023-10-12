package com.andreyyon.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador ~
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String
     * Intenger
     * Double
     * Boolean
     * Float
     * char
     * Date
     * void
     */
     /*
      * Body
      */
      
    @PostMapping("/")
    public void create(@RequestBody UserModel UserModel){
        System.out.println(UserModel.getUsername());
    }
}
