package cl.nttdata.msUserRegistrer.controller;

import cl.nttdata.msUserRegistrer.to.request.PhoneRequest;
import cl.nttdata.msUserRegistrer.to.response.PhoneResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface PhoneController {
    @RequestMapping(
            method = RequestMethod.POST,
            path = "/telefono",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<PhoneResponse> addPhone(PhoneRequest usuarioRequest);
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/user",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<PhoneResponse> getPhone(PhoneRequest usuarioRequest);

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "/user",
            consumes = "application/json",
            produces = "application/json"
    )
    public ResponseEntity<PhoneResponse> deletePhone(PhoneRequest usuarioRequest);
}
