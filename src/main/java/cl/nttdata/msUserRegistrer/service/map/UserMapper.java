package cl.nttdata.msUserRegistrer.service.map;

import cl.nttdata.msUserRegistrer.to.entity.PhoneEntity;
import cl.nttdata.msUserRegistrer.to.entity.UserEntity;
import cl.nttdata.msUserRegistrer.to.request.PhoneRequest;
import cl.nttdata.msUserRegistrer.to.request.UserRequest;
import cl.nttdata.msUserRegistrer.to.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class UserMapper {
    public UserEntity mapToEntity(UserRequest request) {

        List<PhoneEntity> telefonos = request.getPhoneRequestList().stream()
                .map(phoneRequest -> PhoneEntity.builder()
                        .numero(phoneRequest.getNumero())
                        .codigoCiudad(phoneRequest.getCodigoCiudad())
                        .codigoPais(phoneRequest.getCodigoPais())
                        .build())
                .collect(Collectors.toList());


        UserEntity user = UserEntity.builder()
                .nombre(request.getName())
                .correo(request.getMail())
                .contrasenna(request.getPass())
                .telefonos(telefonos)
                .build();


        telefonos.forEach(tel -> tel.setUsuario(user));

        return user;
    }

    public UserResponse mapToDto(UserEntity userEntity){
        return UserResponse.builder()
                .id(String.valueOf(userEntity.getId()))
                .fechaCreacion(new Date())
                .fechaUltimoLogin(new Date())
                .build();
    }
}
