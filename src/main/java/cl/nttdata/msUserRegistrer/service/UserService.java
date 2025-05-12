package cl.nttdata.msUserRegistrer.service;

import cl.nttdata.msUserRegistrer.to.request.UserRequest;
import cl.nttdata.msUserRegistrer.to.response.UserResponse;

import java.util.HashMap;

public interface UserService {
    public UserResponse userAdd(UserRequest usuarioRequest);
}
