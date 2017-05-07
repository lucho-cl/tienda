package cl.tcgplanet.converter;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import cl.tcgplanet.domain.Customer;
import cl.tcgplanet.service.CustomerService;

@FacesConverter("customerConverter")
public class CustomerConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                CustomerService service = (CustomerService) context.getExternalContext().getApplicationMap().get("customerService");
                Customer customer = new Customer();
                customer.setId(Integer.getInteger(value));
				return service.getCustomer(customer);
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
            }
        }
        else {
            return null;
        }
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object object) {
        if(object != null) {
            return String.valueOf(((Customer) object).getId());
        }
        else {
            return null;
        }
	}

}
