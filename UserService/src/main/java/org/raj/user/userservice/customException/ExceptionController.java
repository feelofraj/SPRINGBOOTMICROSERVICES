package org.raj.user.userservice.customException;

import org.raj.user.userservice.DTO.User;
import org.raj.user.userservice.custom.UserNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = UserNotFound.class)
    public ResponseEntity<User> userNotFound(Long id){
        User user=new User();
        user.setId(id);
        user.setName("Not found");
        return new ResponseEntity<>(user, HttpStatus.NO_CONTENT);
    }
}
