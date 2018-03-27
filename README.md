# test-spring-boot-micro-architecture

### To start local environment:

```
mvn clean install
```

```
docker-compose -f ./docker-compose-local.yml up --force-recreate --build
```

### To shutdown:

```
docker-compose -f ./docker-compose-local.yml down --rmi local
```