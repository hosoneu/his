package edu.neu.hoso.service;

import java.text.ParseException;

public interface SerialNumberService {
    public String generateSerialNumber(int choice) throws ParseException;
}
