package eu.reitmayer.lang.entgen;

import java.util.Hashtable;

public class GlobalContext {

	public Hashtable<String, Domain> domains = new Hashtable<String, Domain>();
	
	public Hashtable<String, DataElement> dataElements = new Hashtable<String, DataElement>();
	
	public Hashtable<String, Entity> entities = new Hashtable<String, Entity>();
}
