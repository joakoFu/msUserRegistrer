package cl.nttdata.msUserRegistrer.controller.impl;

import cl.nttdata.msUserRegistrer.controller.PhoneController;
import cl.nttdata.msUserRegistrer.to.request.PhoneRequest;
import cl.nttdata.msUserRegistrer.to.response.PhoneResponse;
import org.springframework.http.ResponseEntity;

public class PhoneControllerImpl implements PhoneController {
    @Override
    public ResponseEntity<PhoneResponse> addPhone(PhoneRequest usuarioRequest) {
        return null;
    }

    @Override
    public ResponseEntity<PhoneResponse> getPhone(PhoneRequest usuarioRequest) {
        return null;
    }

    @Override
    public ResponseEntity<PhoneResponse> deletePhone(PhoneRequest usuarioRequest) {
        return null;
    }
}
