package Ontology;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import edu.stanford.smi.protege.event.ClsListener;
import edu.stanford.smi.protege.event.FrameListener;
import edu.stanford.smi.protege.event.InstanceListener;
import edu.stanford.smi.protege.model.BrowserSlotPattern;
import edu.stanford.smi.protege.model.Cls;
import edu.stanford.smi.protege.model.Facet;
import edu.stanford.smi.protege.model.Frame;
import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protege.model.Instance;
import edu.stanford.smi.protege.model.KnowledgeBase;
import edu.stanford.smi.protege.model.Project;
import edu.stanford.smi.protege.model.Slot;
import edu.stanford.smi.protege.model.ValueType;
import edu.stanford.smi.protegex.owl.model.OWLIndividual;
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.model.OWLNamedClass;
import edu.stanford.smi.protegex.owl.model.RDFIndividual;
import edu.stanford.smi.protegex.owl.model.RDFObject;
import edu.stanford.smi.protegex.owl.model.RDFProperty;
import edu.stanford.smi.protegex.owl.model.RDFResource;
import edu.stanford.smi.protegex.owl.model.RDFSClass;
import edu.stanford.smi.protegex.owl.model.RDFSLiteral;
import edu.stanford.smi.protegex.owl.model.event.ClassListener;
import edu.stanford.smi.protegex.owl.model.event.PropertyValueListener;
import edu.stanford.smi.protegex.owl.model.event.ResourceListener;
import edu.stanford.smi.protegex.owl.model.visitor.OWLModelVisitor;

public class OWLNamedClass_OpenSBS implements OWLNamedClass {

	private String NameClass;
	private List<OWLNamedClass_OpenSBS> SuperClasses;
	private List<OWLNamedClass_OpenSBS> SubClasses;

	public OWLNamedClass_OpenSBS(String Name) {
		NameClass = Name;
		SubClasses = new ArrayList<OWLNamedClass_OpenSBS>();
		SuperClasses =  new ArrayList<OWLNamedClass_OpenSBS>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public RDFResource createAnonymousInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFIndividual createRDFIndividual(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set getAssociatedProperties() {
		// TODO Auto-generated method stub
		return null;
	}



	public String getNameClass() {
		return NameClass;
	}

	public void setNameClass(String nameClass) {
		NameClass = nameClass;
	}

	public List<OWLNamedClass_OpenSBS> getSuperClasses() {
		return SuperClasses;
	}

	public void setSuperClasses(List<OWLNamedClass_OpenSBS> superClasses) {
		SuperClasses = superClasses;
	}

	public List<OWLNamedClass_OpenSBS> getSubClasses() {
		return SubClasses;
	}

	public void setSubClasses(List<OWLNamedClass_OpenSBS> subClasses) {
		SubClasses = subClasses;
	}

	public void setSubClasses(OWLNamedClass_OpenSBS SubClasses) {
		this.SubClasses.add(SubClasses);
	}

	public OWLNamedClass_OpenSBS getSubClasses(int i) {
		return this.SubClasses.get(i);
	}
	@Override
	public RDFSClass getFirstSuperclass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getUnionRangeClasses(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFunctionalProperty(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isVisibleFromOWLThing() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addClassListener(ClassListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSuperclass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public RDFSClass createClone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFResource createInstance(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDependingClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getEquivalentClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageIcon getImageIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInferredInstanceCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getInferredInstances(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInstanceCount(boolean arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getInstances(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getNamedSubclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getNamedSubclasses(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getNamedSuperclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getNamedSuperclasses(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNestedBrowserText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getNestedNamedClasses(Set arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getParsableExpression() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getPureSuperclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSubclassCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getSubclasses(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSuperclassCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getSuperclasses(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getUnionDomainProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getUnionDomainProperties(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasEquivalentClass(RDFSClass arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPropertyValueWithBrowserText(RDFProperty arg0, String arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAnonymous() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMetaclass() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSubclassOf(RDFSClass arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeClassListener(ClassListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSuperclass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addClsListener(ClsListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDirectSuperclass(Cls arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDirectTemplateSlot(Slot arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTemplateFacetValue(Slot arg0, Facet arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addTemplateSlotValue(Slot arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Instance createDirectInstance(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BrowserSlotPattern getBrowserSlotPattern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getConcreteSubclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BrowserSlotPattern getDirectBrowserSlotPattern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDirectInstanceCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getDirectInstances() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDirectSubclassCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getDirectSubclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDirectSuperclassCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<Cls> getDirectSuperclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getDirectTemplateFacetValues(Slot arg0, Facet arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getDirectTemplateSlotValues(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDirectTemplateSlots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDirectlyOverriddenTemplateFacets(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BrowserSlotPattern getInheritedBrowserSlotPattern() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInstanceCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getInstances() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getOverriddenTemplateFacets(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getSubclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getSuperclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getTemplateFacetValue(Slot arg0, Facet arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getTemplateFacetValues(Slot arg0, Facet arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getTemplateFacets(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getTemplateSlotAllowedClses(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getTemplateSlotAllowedParents(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getTemplateSlotAllowedValues(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getTemplateSlotAllowsMultipleValues(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection getTemplateSlotDefaultValues(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getTemplateSlotDocumentation(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTemplateSlotMaximumCardinality(Slot arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Number getTemplateSlotMaximumValue(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTemplateSlotMinimumCardinality(Slot arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Number getTemplateSlotMinimumValue(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getTemplateSlotValue(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValueType getTemplateSlotValueType(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getTemplateSlotValues(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getTemplateSlots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getVisibleDirectSubclassCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getVisibleDirectSubclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getVisibleTemplateSlots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasDirectSuperclass(Cls arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasDirectTemplateSlot(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasDirectlyOverriddenTemplateFacet(Slot arg0, Facet arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasDirectlyOverriddenTemplateSlot(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasInheritedTemplateSlot(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasOverriddenTemplateFacet(Slot arg0, Facet arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasOverriddenTemplateSlot(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasSuperclass(Cls arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTemplateFacet(Slot arg0, Facet arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTemplateSlot(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAbstract() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isClsMetaCls() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConcrete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDefaultClsMetaCls() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDefaultFacetMetaCls() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDefaultSlotMetaCls() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFacetMetaCls() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMetaCls() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRoot() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSlotMetaCls() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void moveDirectSubclass(Cls arg0, Cls arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveDirectTemplateSlot(Slot arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeClsListener(ClsListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDirectSuperclass(Cls arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDirectTemplateSlot(Slot arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTemplateFacetOverrides(Slot arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAbstract(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDirectBrowserSlot(Slot arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDirectBrowserSlotPattern(BrowserSlotPattern arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDirectTypeOfSubclasses(Cls arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateFacetValue(Slot arg0, Facet arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateFacetValues(Slot arg0, Facet arg1, Collection arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotAllowedClses(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotAllowedParents(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotAllowedValues(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotAllowsMultipleValues(Slot arg0, boolean arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotDefaultValues(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotDocumentation(Slot arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotDocumentation(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotMaximumCardinality(Slot arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotMaximumValue(Slot arg0, Number arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotMinimumCardinality(Slot arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotMinimumValue(Slot arg0, Number arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotValue(Slot arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotValueType(Slot arg0, ValueType arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTemplateSlotValues(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDirectType(Cls arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFrameListener(FrameListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addInstanceListener(InstanceListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addOwnFacetValue(Slot arg0, Facet arg1, Object arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addOwnSlotValue(Slot arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean areValidOwnSlotValues(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Frame copy(KnowledgeBase arg0, Map arg1, boolean arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Frame deepCopy(KnowledgeBase arg0, Map arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBrowserText() {
		// TODO Auto-generated method stub
		return NameClass;
	}

	@Override
	public Object getDirectOwnSlotValue(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getDirectOwnSlotValues(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cls getDirectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDirectTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDocumentation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Icon getIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInvalidOwnSlotValueText(Slot arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInvalidOwnSlotValuesText(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KnowledgeBase getKnowledgeBase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getOwnFacetValue(Slot arg0, Facet arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getOwnFacetValues(Slot arg0, Facet arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getOwnSlotAllowsMultipleValues(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection getOwnSlotAndSubslotValues(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getOwnSlotDefaultValues(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getOwnSlotFacetValues(Slot arg0, Facet arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getOwnSlotFacets(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getOwnSlotValue(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOwnSlotValueCount(Slot arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ValueType getOwnSlotValueType(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getOwnSlotValues(Slot arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getOwnSlots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project getProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getReachableSimpleInstances() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getReferences() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getReferences(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasDirectType(Cls arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasOwnSlot(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasType(Cls arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBeingDeleted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDeleted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEditable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isIncluded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSystem() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValidOwnSlotValue(Slot arg0, Object arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void markDeleted(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void markDeleting() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDirectType(Cls arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFrameListener(FrameListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeInstanceListener(InstanceListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeOwnSlotValue(Slot arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDirectOwnSlotValue(Slot arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDirectOwnSlotValues(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Instance setDirectType(Cls arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Instance setDirectTypes(Collection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDocumentation(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDocumentation(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEditable(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setIncluded(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOwnFacetValue(Slot arg0, Facet arg1, Object arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOwnFacetValues(Slot arg0, Facet arg1, Collection arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOwnSlotValue(Slot arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setOwnSlotValues(Slot arg0, Collection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public Frame shallowCopy(KnowledgeBase arg0, Map arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moveDirectType(Cls arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void assertFrameName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public FrameID getFrameID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NameClass;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void moveDirectOwnSlotValue(Slot arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVisible(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Frame arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Slot getBrowserSlot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Slot getDirectBrowserSlot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Slot getInheritedBrowserSlot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cls rename(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addComment(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDifferentFrom(RDFResource arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addIsDefinedBy(RDFResource arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addLabel(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPropertyValue(RDFProperty arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPropertyValueListener(PropertyValueListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addProtegeType(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addRDFType(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addResourceListener(ResourceListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSameAs(RDFResource arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addVersionInfo(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public RDFResource as(Class arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canAs(Class arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RDFResource getAllValuesFromOnTypes(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDifferentFrom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getHasValuesOnTypes(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getIconLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIconName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getInferredTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getIsDefinedBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getLabels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocalName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNamespace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNamespacePrefix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OWLModel getOWLModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getPossibleRDFProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrefixedName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPropertyValue(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPropertyValue(RDFProperty arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFResource getPropertyValueAs(RDFProperty arg0, Class arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPropertyValueCount(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RDFSLiteral getPropertyValueLiteral(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getPropertyValueLiterals(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getPropertyValues(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getPropertyValues(RDFProperty arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getPropertyValuesAs(RDFProperty arg0, Class arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFSClass getProtegeType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getProtegeTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getRDFProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFSClass getRDFType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getRDFTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set getReferringAnonymousClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getSameAs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getVersionInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPropertyValue(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPropertyValue(RDFProperty arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPropertyValue(RDFProperty arg0, Object arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPropertyValue(RDFProperty arg0, Object arg1, boolean arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasProtegeType(RDFSClass arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasProtegeType(RDFSClass arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRDFType(RDFSClass arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRDFType(RDFSClass arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValidPropertyValue(RDFProperty arg0, Object arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator listPropertyValues(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator listPropertyValues(RDFProperty arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator listPropertyValuesAs(RDFProperty arg0, Class arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator listRDFTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeComment(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDifferentFrom(RDFResource arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeIsDefinedBy(RDFResource arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeLabel(String arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePropertyValue(RDFProperty arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePropertyValueListener(PropertyValueListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeProtegeType(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeRDFType(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeResourceListener(ResourceListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSameAs(RDFResource arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeVersionInfo(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setComment(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setComments(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setInferredTypes(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPropertyValue(RDFProperty arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPropertyValues(RDFProperty arg0, Collection arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setProtegeType(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setProtegeTypes(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRDFType(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRDFTypes(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean equalsStructurally(RDFObject arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void accept(OWLModelVisitor arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDeprecated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDeprecated(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection getDisjointClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addDisjointClass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEquivalentClass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addInferredSuperclass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public OWLIndividual createOWLIndividual(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFResource getAllValuesFrom(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getClassificationStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RDFSClass getDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDirectRestrictions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getHasValue(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getHasValues(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getInferredEquivalentClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getInferredSubclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getInferredSuperclasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxCardinality(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinCardinality(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getRestrictions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getRestrictions(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getRestrictions(RDFProperty arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFResource getSomeValuesFrom(RDFProperty arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getSubclassesDisjoint() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasNamedSuperclass() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isConsistent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDefinedClass() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProbeClass() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeDisjointClass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeEquivalentClass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeInferredSuperclass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setClassificationStatus(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDefinition(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSubclassesDisjoint(boolean arg0) {
		// TODO Auto-generated method stub

	}

}
