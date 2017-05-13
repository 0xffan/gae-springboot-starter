/*
 * Copyright 2017 Warren Fan. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Warren Fan
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@RestController
public class Application {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String hello() {
        return "{\"name\":\"SpringBoot\"}";
    }

    /**
     * <a href="https://cloud.google.com/appengine/docs/flexible/java/how-instances-are-managed">Healthy Checking</a>
     * @return The response must include a message body, however, the value of the body is ignored (it can be empty).
     */
    @RequestMapping("/_ah/health")
    public String healthChecking() {
        return "I'm healthy.";
    }

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
