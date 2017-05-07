package cl.tcgplanet.domain;

import java.io.Serializable;

import javax.faces.model.SelectItem;

public class CodeName extends SelectItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8599871740298109010L;

	// @Override
	// public boolean equals(Object obj) {
	// if (obj != null && this.getClass().equals(obj.getClass())) {
	// CodigoNombre other = (CodigoNombre) obj;
	// EqualsBuilder builder = new EqualsBuilder();
	// builder.append(getCodigo(), other.getCodigo());
	// return builder.isEquals();
	// }
	// return false;
	// }
	//
	// @Override
	// public int hashCode() {
	// HashCodeBuilder builder = new HashCodeBuilder();
	// builder.append(getCodigo());
	// return builder.toHashCode();
	// }
}
