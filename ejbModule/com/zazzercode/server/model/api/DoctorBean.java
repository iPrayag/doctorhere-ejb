package com.zazzercode.server.model.api;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class Doctor
 * @author prayag
 */
@Stateless
public class DoctorBean implements DoctorRemote {

    /**
     * Default constructor. 
     */
    public DoctorBean() {
    	
    }

	@Override
	public String getDoctorName() {
		return "prayag";
	}

}
