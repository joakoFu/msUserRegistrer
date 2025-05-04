package cl.nttdata.msUserRegistrer.to.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
public class UserResponse {
    String id;
    String name;
    String mail;
    String pass;
}
