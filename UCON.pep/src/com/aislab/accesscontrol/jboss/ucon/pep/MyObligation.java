/******************************************************************************
 * Project:    Extensible Access Control Framework for Cloud based Applications.
 *                     http://ais.seecs.nust.edu.pk/project/ 
 * Developed by: KTH- Applied Information Security Lab (AIS), 
 *                       NUST-SEECS, H-12 Campus, 
 *                       Islamabad, Pakistan. 
 *                       www.ais.seecs.nust.edu.pk
 * Funded by: National ICT R&D Fund, Ministry of Information Technology & Telecom,
 *                  http://www.ictrdf.org.pk/
 * Copyright (c) 2013-2015 All Rights Reserved, AIS-SEECS NUST & National ICT R&D Fund

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy and/or modify the Software, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software. 

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *****************************************************************************/

package com.aislab.accesscontrol.jboss.ucon.pep;

import java.util.ArrayList;

/**
 * This class will deal with {@code Obligation} tag, stores {@code ObligationId}
 * and {@code AttributeAssignment}
 * 
 * @author Muhammad Sadiq Alvi and Junaid Sarfraz
 * 
 */
public class MyObligation {

	/**
	 * String {@code ObligationId}
	 */
	private String ObId;

	/**
	 * ArrayList for storing {@code AttributeAssignment}
	 */
	private ArrayList<String[]> attAssignment;

	/**
	 * Gets {@code ObligationId}
	 */
	public String getObId() {
		return ObId;
	}

	/**
	 * Sets {@code ObligationId}
	 */
	public void setObId(String obId) {
		ObId = obId;
	}

	/**
	 * Gets {@code AttributeAssignment}
	 */
	public ArrayList<String[]> getAttAssignment() {
		return attAssignment;
	}

	/**
	 * Sets {@code AttributeAssignment}
	 */
	public void setAttAssignment(ArrayList<String[]> attAssignment) {
		this.attAssignment = attAssignment;
	}
}
