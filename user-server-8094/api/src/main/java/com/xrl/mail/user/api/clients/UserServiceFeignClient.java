package com.xrl.mail.user.api.clients;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/

@FeignClient(value = "user-service-8094")
public interface UserServiceFeignClient {


}
