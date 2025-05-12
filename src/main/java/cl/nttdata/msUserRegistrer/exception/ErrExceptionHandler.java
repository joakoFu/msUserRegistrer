package cl.nttdata.msUserRegistrer.exception;


import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.slf4j.Logger;

import java.util.HashMap;

@ControllerAdvice
public class ErrExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(ErrExceptionHandler.class);

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<HashMap> handleDataIntegrityViolation(DataIntegrityViolationException ex) {
        // Puedes personalizar el mensaje
        logger.error("Error de integridad de datos: " + ex.getRootCause().getMessage());
        HashMap<String,String> result = new HashMap<>();
        result.put("mensaje","El correo ya está registrado.");
        return new ResponseEntity<>(result, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<HashMap> handleDataIntegrityViolation(Exception ex) {
        // Puedes personalizar el mensaje
        logger.error("Error de integridad de datos: " + ex.getMessage());
        HashMap<String,String> result = new HashMap<>();
        result.put("mensaje","Error no determinado");
        return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
