/*
 * generated by Xtext
 */
package org.xtext.unq.planificador.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPdmValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.unq.planificador.pdm.PdmPackage.eINSTANCE);
		return result;
	}
}
