package com.caresoft.clinicapp;

import java.util.ArrayList;
public interface AdminCompatibleWithHIPAA {
    
    abstract ArrayList<String> reportSecurityIncidents();
    
    // Default Methods
    public default void printSecurityIncidents() {
        System.out.println(reportSecurityIncidents());
    }
    
    // QA Test
    public default boolean adminQATest(ArrayList<String> expectedIncidents) {
        if (reportSecurityIncidents().equals(expectedIncidents)) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        return reportSecurityIncidents().equals(expectedIncidents);
    }
    
}