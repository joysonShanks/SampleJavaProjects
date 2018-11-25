package com.learner.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * This class provides examples for injecting java collection through java beans
 * 
 * @author Jaison
 *
 */
public class SpringJavaCollection {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	public List getAddressList() {
		System.out.println("List elements : " + this.addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		System.out.println("Set elements : " + this.addressList);
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		System.out.println("Map elements : " + this.addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		System.out.println("Property elements : " + this.addressProp);
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}

}
