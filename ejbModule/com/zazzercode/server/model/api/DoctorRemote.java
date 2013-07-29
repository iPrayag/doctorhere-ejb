package com.zazzercode.server.model.api;

import javax.ejb.Remote;
/**
 * 
 * @author prayag
 *
 */
@Remote
public interface DoctorRemote {
	public String getDoctorName();
}
