package cl.tcgplanet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tcgplanet.domain.Payment;
import cl.tcgplanet.persistence.PaymentMapper;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentMapper paymentMapper;

	@Override
	public List<Payment> getAllPayments() {
		return paymentMapper.getAllPayments();
	}

	@Override
	public List<Payment> getPayments(Payment payment) {
		return paymentMapper.getPayments(payment);
	}

	@Override
	public void insertPayment(Payment payment) {
		paymentMapper.insertPayment(payment);
	}

	@Override
	public void updatePayment(Payment payment) {
		paymentMapper.updatePayment(payment);
	}

	@Override
	public void deletePayment(Payment payment) {
		paymentMapper.deletePayment(payment);
	}

}
