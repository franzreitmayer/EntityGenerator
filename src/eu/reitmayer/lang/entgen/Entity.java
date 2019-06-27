package eu.reitmayer.lang.entgen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.runtime.tree.CommonTree;

public class Entity {
	
	private String id = "";
	private Set<DataElement> elements = new HashSet<DataElement>();
	
	public Entity(String id) {
		super();
		this.id = id;
	}
	
	public Entity(String id, List list, GlobalContext ctx) {
		super();
		this.id = id;
		for (CommonTree t: ((List<CommonTree>)list)) {
			String dataElementId = t.getChild(0).toString();
			DataElement d = ctx.dataElements.get(dataElementId);
			elements.add(d);
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Set<DataElement> getElements() {
		return elements;
	}

	public void setElements(Set<DataElement> elements) {
		this.elements = elements;
	}
	
	public void setElements(DataElement ...dataElements) {
		this.elements = new HashSet<DataElement>(Arrays.asList(dataElements));
	}
	
	public DataElement[] getElementsAsArray() {
		return elements.toArray(new DataElement[0]);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((elements == null) ? 0 : elements.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity other = (Entity) obj;
		if (elements == null) {
			if (other.elements != null)
				return false;
		} else if (!elements.equals(other.elements))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", elements=" + elements + "]";
	}
	
	
	
}
