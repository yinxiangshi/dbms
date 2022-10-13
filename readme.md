# Build instruction

The database used in this repo is mysql, you need have a database named `UnivDB`, you could also
use other db, but please modify the `url` in `src/main/java/backends/ConnectDB`.

To run the code, you need to modify the `src/main/java/backends/ConnectDB` to add `user` and `pwd`.

Also, the project is built by maven, please use maven commands `tomcat7:run` to build it instead of running in IDE.

There is **no** local dependency, make sure the code is not running via local environment.

JDK version is 1.7

Allonsy.