package cl.nttdata.msUserRegistrer.service.map;

import cl.nttdata.msUserRegistrer.to.entity.PhoneEntity;
import cl.nttdata.msUserRegistrer.to.entity.UserEntity;
import cl.nttdata.msUserRegistrer.to.request.PhoneRequest;
import cl.nttdata.msUserRegistrer.to.request.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public class UserMapper {
    public UserEntity mapToEntity(UserRequest request) {
        // Mapeo de teléfonos con builder
        List<PhoneEntity> telefonos = request.getPhoneRequestList().stream()
                .map(phoneRequest -> PhoneEntity.builder()
                        .numero(phoneRequest.getNumero())
                        .codigoCiudad(phoneRequest.getCodCiudad())
                        .codigoPais(phoneRequest.getCodPais())
                        .build())
                .collect(Collectors.toList());

        // Crear entidad de usuario con builder
        UserEntity user = UserEntity.builder()
                .nombre(request.getName())
                .correo(request.getMail())
                .contraseña(request.getPass())
                .telefonos(telefonos)
                .build();

        // Establecer la relación inversa (usuario en cada teléfono)
        telefonos.forEach(tel -> tel.setUsuario(user));

        return user;
    }
}
