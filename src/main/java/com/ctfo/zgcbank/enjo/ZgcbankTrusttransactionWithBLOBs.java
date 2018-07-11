package com.ctfo.zgcbank.enjo;

public class ZgcbankTrusttransactionWithBLOBs extends ZgcbankTrusttransaction {
    private String request;

    private String response;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }
}