package org.epsi.catalogue.clients;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="User_Microservice")
public interface UserRestClient {


}
