package cl.nttdata.msUserRegistrer.controller.impl;

import cl.nttdata.msUserRegistrer.controller.UsuarioController;
import cl.nttdata.msUserRegistrer.service.impl.UserServiceImpl;
import cl.nttdata.msUserRegistrer.to.request.UserRequest;
import cl.nttdata.msUserRegistrer.to.response.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserControllerImpl implements UsuarioController {
    private final UserServiceImpl userService;
    @Override
    public ResponseEntity<UserResponse> userAdd(UserRequest usuarioRequest) {
        userService.userAdd(usuarioRequest);
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> getUser(UserRequest usuarioRequest) {
        return null;
    }

    @Override
    public ResponseEntity<UserResponse> deleteUser(UserRequest usuarioRequest) {
        return null;
    }
}
