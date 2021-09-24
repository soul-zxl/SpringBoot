package com.example.demotest.errors;

public class BusinessException extends RuntimeException  {

    private static final long serialVersionUID = 1L;

    private Object errData;

    public BusinessException(String defaultMessage) {
        super(defaultMessage);
    }

    public BusinessException(String defaultMessage,Object errData) {
        super(defaultMessage);
        this.errData = errData;
    }

    public Object getErrData(){
        return this.errData;
    }

}
