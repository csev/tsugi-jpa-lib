/**
 * Copyright 2014 Unicon (R)
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tsugi.zippy;

import org.tsugi.lti.model.*;
import org.tsugi.lti.repository.AllRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

/**
 * LTI Request object holds all the details for a valid LTI request
 * (including data populated on the validated launch)
 *
 * This basically does everything in lti_db.php from tsugi (except the OAuth stuff, that is handled by spring security)
 *
 */
@Configuration
@ComponentScan("org.tsugi.lti")
public class Tsugi {

    @Autowired
    AllRepositories allRepositories;

    public String bob = "bob";

    public Tsugi () {
System.out.println("+=+=++++++++++++++++++++++++++++ Constructor");
System.out.println("allRepositories="+allRepositories);
    }

    public void init() {
System.out.println("+=+=++++++++++++++++++++++++++++ Tsugi init");
System.out.println("allRepositories="+allRepositories);
    }

    public void check() {
System.out.println("+=+=++++++++++++++++++++++++++++ Tsugi check");
System.out.println("allRepositories="+allRepositories);
    }

}
