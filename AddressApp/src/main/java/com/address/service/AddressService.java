package com.address.service;

import java.util.List;

import com.address.beans.Address;
import com.address.dao.AddressDao;

public class AddressService {

	
	AddressDao addressDao=new AddressDao();
	
	public List<Address> addAddress(Address address){
		return addressDao.addAddress(address);
	}
	public Address modifyAddress(Address address){
		return addressDao.modifyAddress(address);
	}
	public List<Address> getCustomerAddresses(String emailId){
		return addressDao.getCustomerAddresses(emailId);
	}
	
	
}
