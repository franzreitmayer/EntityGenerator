package eu.reitmayer.lang.entgen;

public class Domain {
	private String id = "";
	private String jtype = "";
	private String dbtype = "";
	private Integer length = -1;
	private Integer precision = -1;
	public Domain(String id, String jtype, String dbtype, Integer length,
			Integer precision) {
		super();
		this.id = id;
		this.jtype = jtype;
		this.dbtype = dbtype;
		this.length = length;
		this.precision = precision;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJtype() {
		return jtype;
	}
	public void setJtype(String jtype) {
		this.jtype = jtype;
	}
	public String getDbtype() {
		return dbtype;
	}
	public void setDbtype(String dbtype) {
		this.dbtype = dbtype;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getPrecision() {
		return precision;
	}
	public void setPrecision(Integer precision) {
		this.precision = precision;
	}
	public String getSQLText() {
		if (! (length == -1 || precision == -1) ) {
			return dbtype + "(" + length + ", " + precision + ")";
		} else if (! (length == -1) ){
			return dbtype + "(" + length + ")";
		} else {
			return dbtype;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dbtype == null) ? 0 : dbtype.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((jtype == null) ? 0 : jtype.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result
				+ ((precision == null) ? 0 : precision.hashCode());
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
		Domain other = (Domain) obj;
		if (dbtype == null) {
			if (other.dbtype != null)
				return false;
		} else if (!dbtype.equals(other.dbtype))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (jtype == null) {
			if (other.jtype != null)
				return false;
		} else if (!jtype.equals(other.jtype))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (precision == null) {
			if (other.precision != null)
				return false;
		} else if (!precision.equals(other.precision))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Domain [id=" + id + ", jtype=" + jtype + ", dbtype=" + dbtype
				+ ", length=" + length + ", precision=" + precision + "]";
	}
	
	
}
