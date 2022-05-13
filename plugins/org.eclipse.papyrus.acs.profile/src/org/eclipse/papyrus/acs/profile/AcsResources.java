package org.eclipse.papyrus.acs.profile;

import org.eclipse.emf.common.util.URI;

public class AcsResources {

	public static final String PROFILES_PATHMAP = "pathmap://ACS_PROFILES/"; //$NON-NLS-1$	
	
	public static final String PROFILE_PATH = PROFILES_PATHMAP+"model.profile.uml"; //$NON-NLS-1$
	
	public static final URI PROFILE_PATH_URI = URI.createURI(PROFILE_PATH);
	
	private AcsResources() {
		}
	}
