package com.caresoft.clinicapp;

public interface UserCompatibleWithHIPAA {
	abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
}
