package cl.tcgplanet.domain;

public class CodeName extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8599871740298109010L;
	private Integer code = null;
    private String name = null;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

//    @Override
//    public boolean equals(Object obj) {
//        if (obj != null && this.getClass().equals(obj.getClass())) {
//            CodigoNombre other = (CodigoNombre) obj;
//            EqualsBuilder builder = new EqualsBuilder();
//            builder.append(getCodigo(), other.getCodigo());
//            return builder.isEquals();
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        HashCodeBuilder builder = new HashCodeBuilder();
//        builder.append(getCodigo());
//        return builder.toHashCode();
//    }
}
