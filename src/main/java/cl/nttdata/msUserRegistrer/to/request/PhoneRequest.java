package cl.nttdata.msUserRegistrer.to.request;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhoneRequest {
    private String numero;
    private String codCiudad;
    private String codPais;
    private String mail;

}
