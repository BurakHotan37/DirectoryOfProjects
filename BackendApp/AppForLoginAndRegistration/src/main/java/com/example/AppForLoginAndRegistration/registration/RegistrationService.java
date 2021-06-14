package com.example.AppForLoginAndRegistration.registration;

import com.example.AppForLoginAndRegistration.appUser.AppUser;
import com.example.AppForLoginAndRegistration.appUser.AppUserRole;
import com.example.AppForLoginAndRegistration.appUser.AppUserService;
import com.example.AppForLoginAndRegistration.registration.token.ConfirmationToken;
import com.example.AppForLoginAndRegistration.registration.token.ConfirmationTokenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class RegistrationService
{
    private final AppUserService appUserService;
    private final EmailValidator emailValidator;
    private final ConfirmationTokenService confirmationTokenService;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.
                test(request.getEmail());

        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }

        String token = appUserService.signUpUser(
                new AppUser(
                        request.getFirstname(),
                        request.getLastname(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER

                )
        );


        return token;
    }

    @Transactional
    public String confirmToken(String token) {
        ConfirmationToken confirmation = confirmationTokenService
                .getToken(token)
                .orElseThrow(() ->
                        new IllegalStateException("token not found"));

        if (confirmation.getConfirmedAt() != null) {
            throw new IllegalStateException("email already confirmed");
        }

        LocalDateTime expiredAt = confirmation.getExpiresAt();

        if (expiredAt.isBefore(LocalDateTime.now())) {
            throw new IllegalStateException("token expired");
        }

        confirmationTokenService.setConfirmedAt(token);
        appUserService.enableAppUser(
                confirmation.getAppUser().getEmail());
        return "confirmed";
    }


}
