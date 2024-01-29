package Exceptions.Exceptions1.Model.Exceptions;

import java.io.Serial;

public class DomainException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L; //serializable;

    public DomainException (String msg){
        super(msg);
    }
}
