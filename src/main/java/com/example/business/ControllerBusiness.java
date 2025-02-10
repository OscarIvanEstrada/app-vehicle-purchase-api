package com.example.business;
 
import com.example.repository.*;
import com.example.dto.*;
import com.example.model.*;
import com.example.exceptions.ApiException;
import com.example.enums.ErrorEnum;

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
		//DONE: Validate data
		//TODO: Validate data
		if(data.getCustomerId() == null || data.getCustomerId().isEmpty()){
			throw new ApiException(ErrorEnum.VALIDATION,"customerId is required");
		}
		//DONE: Add logs
		//TODO: Add logs
		log.info("addDataCustomer",data);
		customerRepository.save(data);
	}

	public List<CustomerEntity> getDataCustomer() {
		//DONE: Prevent null pointer
		//TODO: Prevent null pointer
		List<CustomerEntity> result = new ArrayList<CustomerEntity>();
		customerRepository.findAll().forEach((final CustomerEntity r) -> result.add(r));
		return result;
	}
   
	@Autowired
    OrderRepository orderRepository;

	public void addDataOrder(OrderEntity data) {
		
		if(data.getCustomerId() == null || data.getCustomerId().isEmpty()){
			throw new ApiException(ErrorEnum.VALIDATION,"customerId is required");
		}
		if(data.getVin() == null || data.getVin().isEmpty()){
			throw new ApiException(ErrorEnum.VALIDATION,"vin is required");
		}
		orderRepository.save(data);
	}

	public List<OrderEntity> getDataOrder() {
		//DONE: Prevent null pointer
		//TODO: Prevent null pointer
		List<OrderEntity> result = new ArrayList<OrderEntity>();
		orderRepository.findAll().forEach((final OrderEntity r) -> result.add(r));
		return result;
	}






}