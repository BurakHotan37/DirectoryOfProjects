package com.example.AppForLoginAndRegistration.registration;

import com.example.AppForLoginAndRegistration.appUser.AppUser;
import com.example.AppForLoginAndRegistration.appUser.AppUserRole;
import com.example.AppForLoginAndRegistration.appUser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService
{
    private final EmailValidator emailValidator;
    private final AppUserService appUserService;
    public String register(RegistrationRequest request)
    {
       boolean isValidEmail =  emailValidator.test(request.getEmail());
       if(!isValidEmail)
       {
           throw new IllegalStateException("email not valid");
       }
        return appUserService.signUpUser(new AppUser(request.getFirstname(), request.getLastname(), request.getEmail(), request.getPassword(), AppUserRole.USER));
    }
}
