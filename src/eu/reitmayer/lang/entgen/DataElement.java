package eu.reitmayer.lang.entgen;

public class DataElement {
	private String id = "";
	private String stext = "";
	private String mtext = "";
	private String ltext = "";
	private Domain domain = null;
	public DataElement(String id, String stext, String mtext, String ltext,
			Domain domain) {
		super();
		this.id = id;
		this.stext = stext;
		this.mtext = mtext;
		this.ltext = ltext;
		this.domain = domain;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStext() {
		return stext;
	}
	public void setStext(String stext) {
		this.stext = stext;
	}
	public String getMtext() {
		return mtext;
	}
	public void setMtext(String mtext) {
		this.mtext = mtext;
	}
	public String getLtext() {
		return ltext;
	}
	public void setLtext(String ltext) {
		this.ltext = ltext;
	}
	public Domain getDomain() {
		return domain;
	}
	public void setDomain(Domain domain) {
		this.domain = domain;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((ltext == null) ? 0 : ltext.hashCode());
		result = prime * result + ((mtext == null) ? 0 : mtext.hashCode());
		result = prime * result + ((stext == null) ? 0 : stext.hashCode());
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
		DataElement other = (DataElement) obj;
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ltext == null) {
			if (other.ltext != null)
				return false;
		} else if (!ltext.equals(other.ltext))
			return false;
		if (mtext == null) {
			if (other.mtext != null)
				return false;
		} else if (!mtext.equals(other.mtext))
			return false;
		if (stext == null) {
			if (other.stext != null)
				return false;
		} else if (!stext.equals(other.stext))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DataElement [id=" + id + ", stext=" + stext + ", mtext="
				+ mtext + ", ltext=" + ltext + ", domain=" + domain + "]";
	}
	
	
}
