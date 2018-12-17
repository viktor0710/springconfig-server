# springconfig-server
example project for getting config values using spring cloud config - server

After "mvn clean install" and running the project you can check if the config is fetched correctly by calling:

curl http://localhost:8888/config-server-client/production/master

curl http://localhost:8888/config-server-client/development/master

curl http://localhost:8888/cfg/development/master
