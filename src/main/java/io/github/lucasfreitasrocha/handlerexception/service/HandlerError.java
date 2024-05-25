package io.github.lucasfreitasrocha.handlerexception.service;


import io.github.lucasfreitasrocha.handlerexception.exception.HandlerException;
import io.github.lucasfreitasrocha.handlerexception.model.ErrorModel;
import io.github.lucasfreitasrocha.handlerexception.model.HandlerErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class HandlerError {

    private HandlerErrorModel handlerErrorModel;
    public HandlerError init(){
        handlerErrorModel = new HandlerErrorModel();
        return this;
    }

    public HandlerError addError(String message){
        this.handlerErrorModel.getErrors().add(new ErrorModel("error:", message));
        return this;
    }
    public HandlerError addFieldError(String field, String message){
        this.handlerErrorModel.getErrors().add(new ErrorModel(field, message));
        return this;
    }
    public HandlerError addHttpStatus(HttpStatus status){
        this.handlerErrorModel.setStatus(status);
        return this;
    }
    public void handle(){
        throw new HandlerException(this.handlerErrorModel);
    }
}