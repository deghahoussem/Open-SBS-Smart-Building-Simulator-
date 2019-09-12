package GIS.Ontology;

public interface OutPutIindividual {

	public void Create(String IdName);
	public void Delete();
	public Void SetValuesProperty(String PropertyName , Object PropertyValues);
    public void MakeAction(String nameAtion , Object val);
}
