package cl.nttdata.msUserRegistrer.to.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    @JsonProperty("name")
    private String name;

    @JsonProperty("mail")
    private String mail;

    @JsonProperty("pass")
    private String pass;

    @JsonProperty("phoneRequestList")
    private List<PhoneRequest> phoneRequestList;
}
