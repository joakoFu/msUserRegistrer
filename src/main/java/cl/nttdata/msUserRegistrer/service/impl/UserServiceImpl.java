package cl.nttdata.msUserRegistrer.service.impl;

import cl.nttdata.msUserRegistrer.data.UserRepository;
import cl.nttdata.msUserRegistrer.service.UserService;
import cl.nttdata.msUserRegistrer.to.entity.UserEntity;
import cl.nttdata.msUserRegistrer.to.request.UserRequest;
import cl.nttdata.msUserRegistrer.to.response.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import cl.nttdata.msUserRegistrer.service.map.UserMapper;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    UserMapper userMapper;
    @Override
    public UserResponse userAdd(UserRequest usuarioRequest) {
        UserEntity userEntity = userMapper.mapToEntity(usuarioRequest);
        userRepository.save(userEntity);
        return null;
    }
}
