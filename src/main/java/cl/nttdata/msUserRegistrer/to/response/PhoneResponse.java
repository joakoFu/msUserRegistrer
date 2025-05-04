package cl.nttdata.msUserRegistrer.to.response;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Data
@Builder
@Getter
@Setter
public class PhoneResponse {
    private String numero;
    private String codCiudad;
    private String codPais;
    private List<PhoneResponse> telefonos;

}
