package Ontology;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.Icon;

import edu.stanford.smi.protege.event.FrameListener;
import edu.stanford.smi.protege.event.InstanceListener;
import edu.stanford.smi.protege.event.SlotListener;
import edu.stanford.smi.protege.model.Cls;
import edu.stanford.smi.protege.model.Facet;
import edu.stanford.smi.protege.model.Frame;
import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protege.model.Instance;
import edu.stanford.smi.protege.model.KnowledgeBase;
import edu.stanford.smi.protege.model.Project;
import edu.stanford.smi.protege.model.Slot;
import edu.stanford.smi.protege.model.ValueType;
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.model.OWLObjectProperty;
import edu.stanford.smi.protegex.owl.model.OWLProperty;
import edu.stanford.smi.protegex.owl.model.RDFObject;
import edu.stanford.smi.protegex.owl.model.RDFProperty;
import edu.stanford.smi.protegex.owl.model.RDFResource;
import edu.stanford.smi.protegex.owl.model.RDFSClass;
import edu.stanford.smi.protegex.owl.model.RDFSDatatype;
import edu.stanford.smi.protegex.owl.model.RDFSLiteral;
import edu.stanford.smi.protegex.owl.model.event.PropertyListener;
import edu.stanford.smi.protegex.owl.model.event.PropertyValueListener;
import edu.stanford.smi.protegex.owl.model.event.ResourceListener;
import edu.stanford.smi.protegex.owl.model.visitor.OWLModelVisitor;

public class OWLObjectProperty_OpenSBS  implements OWLObjectProperty{

	private String NameObjectProperty;
	private OWLNamedClass_OpenSBS SuperObjectProperty;
	private List<OWLNamedClass_OpenSBS> SubObjectProperty;

	public OWLObjectProperty_OpenSBS(String name) {
		this.NameObjectProperty = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isInverseFunctional() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isObjectProperty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setInverseFunctional(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEquivalentProperty(RDFProperty arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPropertyListener(PropertyListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSuperproperty(RDFProperty arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addUnionDomainClass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public RDFSClass getDomain(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDomains(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getEquivalentProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFProperty getFirstSuperproperty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Icon getInheritedIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFProperty getInverseProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFResource getRange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFResource getRange(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RDFSDatatype getRangeDatatype() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getRanges(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getSubproperties(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSubpropertyCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getSuperproperties(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSuperpropertyCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getUnionDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getUnionDomain(boolean arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getUnionRangeClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasDatatypeRange() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasObjectRange() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasRange(boolean arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAnnotationProperty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDomainDefined() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDomainDefined(boolean arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFunctional() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPureAnnotationProperty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isRangeDefined() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isReadOnly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSubpropertyOf(RDFProperty arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeEquivalentProperty(OWLProperty arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removePropertyListener(PropertyListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSuperproperty(RDFProperty arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUnionDomainClass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDomain(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDomainDefined(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDomains(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setEquivalentProperties(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFunctional(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setInverseProperty(RDFProperty arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRange(RDFResource arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setRanges(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setUnionRangeClasses(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addDirectSuperslot(Slot arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addSlotListener(SlotListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection getAllowedClses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getAllowedParents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getAllowedValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getAllowsMultipleValues() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Facet getAssociatedFacet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDefaultValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDirectDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDirectSubslotCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getDirectSubslots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getDirectSuperslotCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection getDirectSuperslots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDocumentation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Slot getInverseSlot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaximumCardinality() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Number getMaximumValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMinimumCardinality() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Number getMinimumValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getSubslots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getSuperslots() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ValueType getValueType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection getValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasDirectSuperslot(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasSuperslot(Slot arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasValueAtSomeFrame() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void moveDirectSubslot(Slot arg0, Slot arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeDirectSuperslot(Slot arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSlotListener(SlotListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAllowedClses(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAllowedParents(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAllowedValues(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAllowsMultipleValues(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setAssociatedFacet(Facet arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDefaultValues(Collection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDirectTypeOfSubslots(Cls arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setDocumentation(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setInverseSlot(Slot arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMaximumCardinality(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMaximumValue(Number arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMinimumCardinality(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMinimumValue(Number arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setValueType(ValueType arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setValues(Collection arg0) {
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
		return NameObjectProperty;
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
		return NameObjectProperty;
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
	public Collection getTemplateSlotClses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Slot rename(String arg0) {
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
	public boolean isAnonymous() {
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
	public void addUnionRangeClass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSymmetric() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTransitive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeUnionRangeClass(RDFSClass arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setSymmetric(boolean arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTransitive(boolean arg0) {
		// TODO Auto-generated method stub

	}

}
