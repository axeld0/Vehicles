package Model.Exceptions;

public class HasNoLicenceException extends IllegalArgumentException{

    public HasNoLicenceException(){
        System.out.println("No Licence!");
    }
}
