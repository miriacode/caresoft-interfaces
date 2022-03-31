package com.caresoft.clinicapp;

import java.sql.Date;
import java.util.ArrayList;

public class Physician extends User implements UserCompatibleWithHIPAA{
	
	private ArrayList<String> patientNotes;

	public Physician(Integer id) {
		super(id);
	}
	
	public boolean assignPin(int pin) {
		String pinString = Integer.toString(pin);
		if(pinString.length()==4) {
			this.pin = pin;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean accessAuthorized(Integer id) {
		return (this.id == id)? true: false;
	}
	
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Submitted Date: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
}
