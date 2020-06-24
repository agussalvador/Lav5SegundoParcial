package com.utn.rest.model;

public interface ClientView {

    String getDni();

    String getFullNumber();

    String getCityAndProvince();

    Integer getCountPhoneLines();

    void setDni(String dni);

    void setFullNumber(String fullNumber);

    void setCityAndProvince(String cityAndProvince);

    void setCountPhoneLines(Integer countPhoneLines);



}
