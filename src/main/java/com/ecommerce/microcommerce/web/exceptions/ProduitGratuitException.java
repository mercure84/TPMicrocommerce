package com.ecommerce.microcommerce.web.exceptions;

public class ProduitGratuitException extends RuntimeException {

    @@ResponseStatus(HttpStatus.BAD_REQUEST)
    public ProduitGratuitException(String s) {
        super(s);
    }
}
