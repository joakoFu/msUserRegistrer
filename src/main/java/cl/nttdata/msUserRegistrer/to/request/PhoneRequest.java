package cl.nttdata.msUserRegistrer.to.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhoneRequest {
    @JsonProperty("numero")
    private String numero;

    @JsonProperty("codigoCiudad")
    private String codigoCiudad;

    @JsonProperty("codigoPais")
    private String codigoPais;
}
