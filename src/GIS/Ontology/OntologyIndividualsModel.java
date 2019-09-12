package GIS.Ontology;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Ontology.OWLDatatypeProperty_OpenSBS;
import Ontology.OWLNamedClass_OpenSBS;
import Ontology.OWLObjectProperty_OpenSBS;
import Ontology.Smart_Building_Ontology_Model;

import edu.stanford.smi.protegex.owl.model.OWLIndividual;

import edu.stanford.smi.protegex.owl.model.RDFSLiteral;
import javafx.scene.control.TextArea;

public class OntologyIndividualsModel {
	private Smart_Building_Ontology_Model OntologyModelGIS;
	private List<OntologyIndividuals> OntologyIndividuals;
	int id = 0;

	public OntologyIndividualsModel() {
		super();
		OntologyModelGIS = new Smart_Building_Ontology_Model();
		OntologyIndividuals = new ArrayList<OntologyIndividuals>();
	}

	public OntologyIndividuals GetOntologyIndividuals(String id) {
		for (int i = OntologyIndividuals.size() - 1; i >= 0; i--) {
			if (id.equals(OntologyIndividuals.get(i).getOntologyIndividualsId())) {
				return OntologyIndividuals.get(i);
			}
		}
		return null;
	}
	/*
	 * public String GetOntologyIndividualsid_from_ontologyid(String id){ for(int i
	 * = OntologyIndividuals.size()-1; i >=0; i--){
	 * if(id.equals(OntologyIndividuals.get(i).getOWLIndividual().getBrowserText()))
	 * { return OntologyIndividuals.get(i).getOntologyIndividualsId(); } } return
	 * null; }
	 */

	public boolean CreateIndividual(String IndName, OWLNamedClass_OpenSBS classType, OutPutIindividual OutPutIindividual) {
		try {

			OntologyIndividuals OntologyIndividual = new OntologyIndividuals();
			OntologyIndividual.setOutPutIindividual(OutPutIindividual);
			OntologyIndividual.setOWLIndividualRDFType(classType.getBrowserText());
			OntologyIndividual.setId(id);

			OntologyIndividual.setOntologyIndividualsId(IndName);
			OntologyIndividuals.add(OntologyIndividual);
			OntologyIndividual.getOutPutIindividual().Create(IndName);

			id = id + 1;
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean DeteleIndividual(String IndName) {
		try {
			int i = 0;
			OntologyIndividuals OntologyIndividual;
			while (i < OntologyIndividuals.size()) {
				OntologyIndividual = OntologyIndividuals.get(i);
				if (OntologyIndividual.getOntologyIndividualsId().equals(IndName)) {
					System.out.println(" we delete : " + OntologyIndividual.getOntologyIndividualsId());
					OntologyIndividual.getOutPutIindividual().Delete();
					OntologyIndividuals.remove(i);

					return true;
				}

				i++;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean AddOWLDatatypeProperty(String IndName, OWLDatatypeProperty_OpenSBS Datatype, String Val) {
		try {

			int i = 0;
			while (i < OntologyIndividuals.size()) {

				if (OntologyIndividuals.get(i).getOntologyIndividualsId().equals(IndName)) {

					OWLDatatypePropertyGIS OWLDatatypePropertyGIS = new OWLDatatypePropertyGIS();

					OWLDatatypePropertyGIS.setOWLDatatypePropertyType(Datatype.getBrowserText());
					OWLDatatypePropertyGIS.setOWLDatatypePropertyValues(Val);

					OntologyIndividuals.get(i).getOWLDatatypeProperty().add(OWLDatatypePropertyGIS);

					return true;

				}
				;
				i++;
			}
			return false;
		} catch (Exception e) {

			return false;
		}

	}

	public String GetOWLDatatypeProperty(String IndName, OWLDatatypeProperty_OpenSBS Datatype) {
		try {
			OntologyIndividuals OntologyIndividual;
			int i = 0;
			while (i < OntologyIndividuals.size()) {
				 OntologyIndividuals.get(i);

				if ( OntologyIndividuals.get(i).getOntologyIndividualsId().equals(IndName)) {

					for (int j = 0; j <  OntologyIndividuals.get(i).getOWLDatatypeProperty().size(); j++) {

						if ( OntologyIndividuals.get(i).getOWLDatatypeProperty().get(j).getOWLDatatypePropertyType()
								.equals(Datatype.getBrowserText())) {
							return  OntologyIndividuals.get(i).getOWLDatatypeProperty().get(j).getOWLDatatypePropertyValues();
						}
					}

				}
				;
				i++;
			}
			return null;
		} catch (Exception e) {
			return null;
		}

	};

	public boolean SetOWLDatatypeProperty(String IndName, OWLDatatypeProperty_OpenSBS Datatype, String Val) {
		try {

			int i = 0;
			while (i < OntologyIndividuals.size()) {


				if (OntologyIndividuals.get(i).getOntologyIndividualsId().equals(IndName)) {

					for (int j = 0; j < OntologyIndividuals.get(i).getOWLDatatypeProperty().size(); j++) {
						if( OntologyIndividuals.get(i).getOWLDatatypeProperty().get(j).getOWLDatatypePropertyType()
								.equals(Datatype.getBrowserText())) {

									OntologyIndividuals.get(i).getOWLDatatypeProperty().get(j).setOWLDatatypePropertyValues(Val);

						}
					}
					return true;

				}
				;
				i++;
			}

			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean AddOWLObjectProperty(String IndName, OWLObjectProperty_OpenSBS ObjectProperty, String IndRange) {
		try {
			int i = 0;
			while (i < OntologyIndividuals.size()) {
				if (OntologyIndividuals.get(i).getOntologyIndividualsId().equals(IndName)) {

					OWLObjectPropertyGIS OWLObjectPropertyGIS = new OWLObjectPropertyGIS();
					OWLObjectPropertyGIS.setDomain(IndName);
					OWLObjectPropertyGIS.setRange(IndRange);
					OWLObjectPropertyGIS.setType(ObjectProperty);

					OntologyIndividuals.get(i).getOWLObjectProperty().add(OWLObjectPropertyGIS);

				}

				i = i + 1;
			}

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean DeteleOWLObjectProperty(String IndName, OWLObjectProperty_OpenSBS ObjectProperty, String IndRange) {
		try {
			OntologyIndividuals OntologyIndividual;
			int i = 0;
			while (i < OntologyIndividuals.size()) {
				OntologyIndividual = OntologyIndividuals.get(i);
				if (OntologyIndividual.getOntologyIndividualsId().equals(IndName)) {

					for (int j = 0; j < OntologyIndividual.getOWLObjectProperty().size(); j++) {

						OWLObjectPropertyGIS OWLObjectProperty = OntologyIndividual.getOWLObjectProperty().get(j);
						if (OWLObjectProperty.getType().getBrowserText().equals(ObjectProperty.getBrowserText())
								&& OWLObjectProperty.getRange().equals(IndRange)) {

							OntologyIndividual.getOWLObjectProperty().remove(j);

						}
					}
					return true;

				}
				;
				i++;
			}

			return false;

		} catch (Exception e) {
			return false;
		}
	}

	public List<OWLObjectPropertyGIS> GetOWLObjectProperty(String IndName, OWLObjectProperty_OpenSBS ObjectProperty) {
		OntologyIndividuals OntologyIndividual;
		int i = 0;
		while (i < OntologyIndividuals.size()) {
			OntologyIndividual = OntologyIndividuals.get(i);
			List<OWLObjectPropertyGIS> L = new ArrayList<OWLObjectPropertyGIS>();

			if (OntologyIndividual.getOntologyIndividualsId().equals(IndName)) {

				for (int j = 0; j < OntologyIndividual.getOWLObjectProperty().size(); j++) {

					OWLObjectPropertyGIS OWLObjectProperty = OntologyIndividual.getOWLObjectProperty().get(j);
					// System.out.print("OWLObjectProperty.getBrowserText( =
					// "+OWLObjectProperty.getType().getBrowserText());
					// System.out.print("ObjectProperty = "+ObjectProperty.getBrowserText());
					if (OWLObjectProperty.getType().getBrowserText().equals(ObjectProperty.getBrowserText())) {
						L.add(OWLObjectProperty);
					}

				}
				return L;
			}
			;
			i++;
		}
		return null;
	}

	public Smart_Building_Ontology_Model getOntologyModelGIS() {
		return OntologyModelGIS;
	}

	public List<OntologyIndividuals> getOntologyIndividuals() {
		return OntologyIndividuals;
	};

	public void desplay_ontology(TextArea t) {
		System.out.println(OntologyIndividuals.size());
		for (int i = 0; i < OntologyIndividuals.size(); i++) {

			t.appendText("	Class : "+OntologyIndividuals.get(i).getOWLIndividualRDFType()+" | Ind : "+OntologyIndividuals.get(i).getOntologyIndividualsId()+"\n");

			for (int j = 0; j < OntologyIndividuals.get(i).getOWLDatatypeProperty().size(); j++) {

				t.appendText("	Data : "+OntologyIndividuals.get(i).getOWLDatatypeProperty().get(j).getOWLDatatypePropertyType());
				t.appendText(" | val : "+OntologyIndividuals.get(i).getOWLDatatypeProperty().get(j).getOWLDatatypePropertyValues()+"\n");

			}

			for (int j = 0; j < OntologyIndividuals.get(i).getOWLObjectProperty().size(); j++) {

				t.appendText("	Object : "+OntologyIndividuals.get(i).getOWLObjectProperty().get(j).getType().getBrowserText()+" | rang : "+OntologyIndividuals.get(i).getOWLObjectProperty().get(j).getRange()+"\n");

			}

		}


	}

}
