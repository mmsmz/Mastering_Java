package MJ8_FileProcessing_with_ExceptionHandlingANDKeyboardInput;

import MJ2_SomePackage.Exampleclass;
import MJ8_FileProcessing_with_ExceptionHandlingANDKeyboardInput.com.ara.Exception.FooRuntimeException;

public class MyFileUtils {
    public int substract10FromLargerNumber(int number) throws FooRuntimeException { // change this "Exception" to my own Custom Exception
        if (number <10){
            // throw  new Exception("Tne mumber passed is smaller than 10");
            throw  new FooRuntimeException("Tne mumber passed is smaller than 10");
        }
         return number -10;
    }

//    public class FooRuntimeException extends Exception{
//        public FooRuntimeException(String message){
//            super(message);
//        }
//    }
}
