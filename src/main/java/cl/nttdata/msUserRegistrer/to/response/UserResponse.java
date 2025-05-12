package cl.nttdata.msUserRegistrer.to.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Builder
@Getter
@Setter
public class UserResponse {
    String id;
    Date fechaCreacion;
    Date fechaUltimoLogin;


}
