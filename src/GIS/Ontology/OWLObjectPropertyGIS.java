package GIS.Ontology;

import edu.stanford.smi.protegex.owl.model.OWLObjectProperty;

public class OWLObjectPropertyGIS{
	private OWLObjectProperty type ;
	private String Domain;
	private String Range;
	public OWLObjectPropertyGIS() {
		// TODO Auto-generated constructor stub
	}
	public OWLObjectProperty getType() {
		return type;
	}
	public void setType(OWLObjectProperty type) {
		this.type = type;
	}
	public String getDomain() {
		return Domain;
	}
	public void setDomain(String domain) {
		Domain = domain;
	}
	public String getRange() {
		return Range;
	}
	public void setRange(String rang) {
		Range = rang;
	}
	
}