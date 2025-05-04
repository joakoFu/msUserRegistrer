package cl.nttdata.msUserRegistrer.controller;

import cl.nttdata.msUserRegistrer.to.request.UserRequest;
import cl.nttdata.msUserRegistrer.to.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public interface UsuarioController {
    @RequestMapping(
            method = RequestMethod.POST,
            path = "/user",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<UserResponse> userAdd(@RequestBody UserRequest usuarioRequest);
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/user",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<UserResponse> getUser(UserRequest usuarioRequest);

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/user",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<UserResponse> deleteUser(UserRequest usuarioRequest);
}
