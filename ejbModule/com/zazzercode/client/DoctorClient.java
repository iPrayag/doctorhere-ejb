/**
 * 
 */
package com.zazzercode.client;

import javax.naming.Context;
import javax.naming.NamingException;

import com.zazzercode.server.model.api.DoctorRemote;

/**
 * @author prayag
 * 
 */
public class DoctorClient {

	private static final String LOOKUP_STRING = "Doctor/remote";

	public static void main(String[] args) {
		DoctorRemote remoteBean = doLookup();
		// 3. Call business logic
		System.out.println(remoteBean.getDoctorName());
	}

	private static DoctorRemote doLookup() {
		Context context = null;
		DoctorRemote remoteBean = null;
		try {
			// 1. Obtaining Context
			context = DoctorContext.getInitialContext();
			// 2. Lookup and cast
			remoteBean = (DoctorRemote) context.lookup(LOOKUP_STRING);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return remoteBean;
	}
}
