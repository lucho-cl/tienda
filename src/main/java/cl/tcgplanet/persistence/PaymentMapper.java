package cl.tcgplanet.persistence;

import java.util.List;

import cl.tcgplanet.domain.Payment;

public interface PaymentMapper {
	
    public List<Payment> getAllPayments();
    
    public List<Payment> getPayments(Payment payment);

    public void insertPayment(Payment payment);

    public void updatePayment(Payment payment);
    
    public void deletePayment(Payment payment);
}
