package com.steve.framework.exception;

public class InsBuineseException extends RuntimeException {

    private static final long serialVersionUID = 2256477558314496007L;

    private Integer status = 4000;

    private String enMessage = "unexpected_ins_exception";

    public InsBuineseException() {
        super("InsDownload exception");
    }

    public InsBuineseException(String zhMessage) {
        super(zhMessage);
    }

    public InsBuineseException(String zhMessage, Throwable cause) {
        super(zhMessage, cause);
    }

    public InsBuineseException(String enMessage, String zhMessage){
        super(zhMessage);
        this.enMessage = enMessage;
    }

    public InsBuineseException(Integer status, String enMessage, String zhMessage) {
        super(zhMessage);
        this.status = status;
        this.enMessage = enMessage;
    }

    public InsBuineseException(Integer status, String enMessage, String zhMessage, Throwable cause) {
        super(zhMessage, cause);
        this.status = status;
        this.enMessage = enMessage;
    }

    public Integer getStatus() {
        return status;
    }

    public String getEnMessage() {
        return enMessage;
    }

}
