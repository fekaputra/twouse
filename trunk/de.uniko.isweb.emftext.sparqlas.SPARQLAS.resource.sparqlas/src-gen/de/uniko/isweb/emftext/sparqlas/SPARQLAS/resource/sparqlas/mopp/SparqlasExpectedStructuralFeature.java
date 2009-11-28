/**
 * <copyright>
 * </copyright>
 *
 * 
 */
//
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

// A representation for a range in a document where a structural feature (e.g.,
// a reference) is expected.
public class SparqlasExpectedStructuralFeature extends de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasAbstractExpectedElement {
	private org.eclipse.emf.ecore.EStructuralFeature feature;
	private org.eclipse.emf.ecore.EObject container;
	private String tokenName;
	
	@Deprecated	public SparqlasExpectedStructuralFeature(org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container, String tokenName) {
		this("0", feature, container, tokenName);
	}
	
	@Deprecated	public SparqlasExpectedStructuralFeature(String scopeID, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container, String tokenName) {
		super(scopeID, false);
		this.feature = feature;
		this.container = container;
		this.tokenName = tokenName;
	}
	
	public SparqlasExpectedStructuralFeature(String scopeID, boolean discardFollowingExpectations, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container, String tokenName) {
		super(scopeID, discardFollowingExpectations);
		this.feature = feature;
		this.container = container;
		this.tokenName = tokenName;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public org.eclipse.emf.ecore.EObject getContainer() {
		return container;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
	public String toString() {
		String simpleName = container == null ? "null" : container.getClass().getSimpleName();
		return super.toString() + " EFeature \"" + feature.getName() + "\" in " + simpleName;
	}
	
	public boolean equals(java.lang.Object o) {
		if (o instanceof SparqlasExpectedStructuralFeature) {
			return this.feature.equals(((SparqlasExpectedStructuralFeature) o).feature);
		}
		return false;
	}
}
