package com.commerce.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.commerce.demo.Models.*;
import com.commerce.demo.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/site/v1/registration")

public class RegistrationController extends MainController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping(value = "/sign_up")
    public void signUp(@RequestBody Customer customer) {
        registrationService.signUp(customer);
    }

    @PostMapping(value = "/sign_in")
    public void signIn(@RequestBody SignInRequest signInRequest) {
        // Authentication
    }

}
