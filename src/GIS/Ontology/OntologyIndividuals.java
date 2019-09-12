package GIS.Ontology;

import java.util.ArrayList;
import java.util.List;

import edu.stanford.smi.protegex.owl.model.*;

public class OntologyIndividuals {
	private String OntologyIndividualsId;
	private String  OWLIndividualRDFType;
	//private OWLIndividual OWLIndividual;
	public String getOWLIndividualRDFType() {
		return OWLIndividualRDFType;
	}

	private List<OWLObjectPropertyGIS> OWLObjectProperty;
	private List<OWLDatatypePropertyGIS> OWLDatatypeProperty;
	private OutPutIindividual OutPutIindividual;
    private int id = 0;
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public OntologyIndividuals() {
		OWLObjectProperty = new ArrayList<OWLObjectPropertyGIS>();
		OWLDatatypeProperty = new ArrayList<OWLDatatypePropertyGIS>();
	}


	public List<OWLObjectPropertyGIS> getOWLObjectProperty() {

		return OWLObjectProperty;
	}

	public List<OWLDatatypePropertyGIS> getOWLDatatypeProperty() {
		return OWLDatatypeProperty;
	}

	public OutPutIindividual getOutPutIindividual() {
		return OutPutIindividual;
	}

	public void setOWLIndividualRDFType(String OWLIndividualRDFType) {
		this.OWLIndividualRDFType = OWLIndividualRDFType;
	}

	public void setOWLObjectProperty(List<OWLObjectPropertyGIS> oWLObjectProperty) {
		OWLObjectProperty = oWLObjectProperty;
	}

	public void setOWLDatatypeProperty(List<OWLDatatypePropertyGIS> oWLDatatypeProperty) {
		OWLDatatypeProperty = oWLDatatypeProperty;
	}

	public void setOutPutIindividual(OutPutIindividual outPutIindividual) {
		OutPutIindividual = outPutIindividual;
	}

	public void setOntologyIndividualsId(String ontologyIndividualsId) {
		OntologyIndividualsId = ontologyIndividualsId;
	}

	public String getOntologyIndividualsId() {
		return OntologyIndividualsId;
	}

	

	

}
