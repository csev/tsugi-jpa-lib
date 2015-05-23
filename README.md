Tsugi for Java - Library Code
=============================

This is a Java version of the PHP Tsugi application (https://github.com/csev/tsugi).  This repository if the API library and a sample application that uses this library is https://github.com/csev/tsugi-j-sample

This is a fork of azeckoski/lti\_starter 

Build
-----
This will produces a jar file and drops it into your maven repository. 

    mvn install

Database
--------

This is expecting that PHP Tsugi already is installed running and its database is on localhost:8889
using the default account, password, and database name and that the tables already exist.
If you want to change this, edit the file

    src/main/resources/application.properties

History
-------

This is a fork of azeckoski/lti\_starter which was originally based on my PHP Tsugi code.


