package com.example.demo.dto;

public class AccessTokenDTO {
    private String clien_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

    public String getClien_id() {
        return clien_id;
    }

    public void setClien_id(String clien_id) {
        this.clien_id = clien_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
