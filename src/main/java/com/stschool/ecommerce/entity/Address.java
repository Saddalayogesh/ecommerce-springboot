package com.stschool.ecommerce.entity;

import com.stschool.ecommerce.enums.AddressType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    private int id;
    private String houseNo;
    private String building;
    private String landMark;
    private String street;
    private String city;
    private String district;
    private String state;
    private String country;
    private int zipCode;
    private AddressType addressType;

}