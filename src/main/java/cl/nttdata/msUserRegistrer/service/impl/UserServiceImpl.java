package cl.nttdata.msUserRegistrer.service.impl;

import cl.nttdata.msUserRegistrer.data.UserRepository;
import cl.nttdata.msUserRegistrer.service.UserService;
import cl.nttdata.msUserRegistrer.to.entity.UserEntity;
import cl.nttdata.msUserRegistrer.to.request.UserRequest;
import cl.nttdata.msUserRegistrer.to.response.UserResponse;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import cl.nttdata.msUserRegistrer.service.map.UserMapper;

import java.util.HashMap;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    UserRepository userRepository;
    UserMapper userMapper;
    @Override
    public UserResponse userAdd(UserRequest usuarioRequest) {
        UserEntity result = userRepository.save( userMapper.mapToEntity(usuarioRequest));
        logger.info(result.toString());
        return userMapper.mapToDto(result);
    }
}
