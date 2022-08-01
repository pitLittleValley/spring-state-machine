package com.example.sstatemachine.services;

import com.example.sstatemachine.domain.Payment;
import com.example.sstatemachine.domain.PaymentEvent;
import com.example.sstatemachine.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {
    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> authorizedPayment(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);

}
