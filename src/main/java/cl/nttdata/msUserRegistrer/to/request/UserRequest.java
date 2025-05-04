package cl.nttdata.msUserRegistrer.to.request;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    private String name;
    private String mail;
    private String pass;
    private List<PhoneRequest> phoneRequestList;
}
