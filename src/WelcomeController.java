/**
 * 
 */
package com.bhaiti.rest.controller;

/**
 * @author Abhijit P
 * This is a sample controller class to handle get request 
 */
import com.bhaiti.beans.Welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	private static final String welcomemsg = "Welcome Mr. %s!";

	//First contribution
    @GetMapping("/welcome/user")
    @ResponseBody
    public Welcome welcomeUser(@RequestParam(name="name",required = false) String name) {
        return new Welcome(String.format(welcomemsg, name));
    }

}
