package cl.nttdata.msUserRegistrer.controller.impl;

import cl.nttdata.msUserRegistrer.controller.UsuarioController;
import cl.nttdata.msUserRegistrer.service.impl.UserServiceImpl;
import cl.nttdata.msUserRegistrer.to.request.UserRequest;
import cl.nttdata.msUserRegistrer.to.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.HashMap;

@Controller
@RequiredArgsConstructor
public class UsuarioControllerImpl implements UsuarioController {
    private final UserServiceImpl userService;
    @Override
    public ResponseEntity<UserResponse> userAdd(UserRequest usuarioRequest) {
        return new ResponseEntity<>(userService.userAdd(usuarioRequest), HttpStatus.CREATED);
    }

}
