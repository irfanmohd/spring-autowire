package com.springautowire.model;

import lombok.*;

@Data
@AllArgsConstructor
public class Address {
    @NonNull
    private  String street;
    @NonNull
    private   String city;
    private static String country;
    private final String areaCode = "76";



}
