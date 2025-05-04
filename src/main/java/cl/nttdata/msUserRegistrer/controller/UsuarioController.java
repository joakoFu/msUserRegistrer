package cl.nttdata.msUserRegistrer.controller;

import cl.nttdata.msUserRegistrer.to.request.UserRequest;
import cl.nttdata.msUserRegistrer.to.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
public interface UsuarioController {
    @PostMapping(
            value = "/user",
            consumes = {"application/json"},
            produces = {"application/json"}
    )
    public ResponseEntity<UserResponse> userAdd(@RequestBody UserRequest usuarioRequest);
}
