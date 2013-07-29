package com.zazzercode.server.model.api;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Doctor
 * @author prayag
 */
@Stateless
public class Doctor implements DoctorRemote {

    /**
     * Default constructor. 
     */
    public Doctor() {
    	
    }

	@Override
	public String getDoctorName() {
		return "prayag";
	}

}
