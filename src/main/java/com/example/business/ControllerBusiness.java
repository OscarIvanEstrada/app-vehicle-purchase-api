package com.example.business;
 
import com.example.repository.*;
import com.example.dto.*;
import com.example.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.util.GSonUtils;
import com.example.util.LoggerUtil;

import java.util.ArrayList;
import java.util.List;


@Component
public class ControllerBusiness {

	@Autowired
	LoggerUtil log;



   
	@Autowired
    VehicleRepository vehicleRepository;

	public void addDataVehicle(VehicleEntity data) {
		vehicleRepository.save(data);
	}

	public List<VehicleEntity> getDataVehicle() {
		List<VehicleEntity> result = new ArrayList<VehicleEntity>();
		vehicleRepository.findAll().forEach((final VehicleEntity r) -> result.add(r));
		return result;
	}
   
	@Autowired
    CustomerRepository customerRepository;

	public void addDataCustomer(CustomerEntity data) {
		customerRepository.save(data);
	}

	public List<CustomerEntity> getDataCustomer() {
		List<CustomerEntity> result = new ArrayList<CustomerEntity>();
		customerRepository.findAll().forEach((final CustomerEntity r) -> result.add(r));
		return result;
	}
   
	@Autowired
    OrderRepository orderRepository;

	public void addDataOrder(OrderEntity data) {
		orderRepository.save(data);
	}

	public List<OrderEntity> getDataOrder() {
		List<OrderEntity> result = new ArrayList<OrderEntity>();
		orderRepository.findAll().forEach((final OrderEntity r) -> result.add(r));
		return result;
	}






}
