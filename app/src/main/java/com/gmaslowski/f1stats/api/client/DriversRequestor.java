package com.gmaslowski.f1stats.api.client;

import java.util.List;

import retrofit.http.GET;

import static com.gmaslowski.f1stats.api.client.endpoint.ErgastEndpoints.ALL_DRIVERS;

public interface DriversRequestor {
    @GET(ALL_DRIVERS)
    List<Driver> getAllDrivers();
}
