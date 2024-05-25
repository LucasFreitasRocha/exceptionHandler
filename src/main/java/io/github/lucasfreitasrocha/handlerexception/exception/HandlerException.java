package io.github.lucasfreitasrocha.handlerexception.exception;


import io.github.lucasfreitasrocha.handlerexception.model.HandlerErrorModel;

public class HandlerException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private  HandlerErrorModel handlerErrorModel;

    public HandlerException(HandlerErrorModel model){
        this.handlerErrorModel = model;
    }
    public HandlerException(String message, Throwable cause) {
        super(message, cause);
    }

    public HandlerErrorModel getHandlerErrorModel() {
        return handlerErrorModel;
    }
}