# About

REST $domain;format="lower"$ micro service capable of CRUD and query operations.

# What's under the hood?

- [Play](https://www.playframework.com/) 
- [ReactiveMongo](http://reactivemongo.org/) 
- [MongoDB](https://www.mongodb.com/) 

# Quick start usage

Execute this:

    cd $org$-service-$domain;format="lower"$/
    sbt run

Invoke CRUD and query operations on the service at `http://localhost:9000/$domain;format="lower"$`

    TODO document rest endpoints:
    curl -X POST http://localhost:9000/$domain;format="lower"$ -d '{ "data" : "whatever" }' -H "Content-Type: application/json"
    curl -X GET http://localhost:9000/$domain;format="lower"$/123
    curl -X PUT http://localhost:9000/$domain;format="lower"$/123 -d '{ "data" : "put update" }' -H "Content-Type: application/json"
    curl -X PATCH http://localhost:9000/$domain;format="lower"$/123 -d '{ "data" : "patch update" }' -H "Content-Type: application/json"
    curl -X DELETE http://localhost:9000/$domain;format="lower"$/123
    curl -X POST http://localhost:9000/$domain;format="lower"$/query -d '{ "data" : "mongo query to go here" }' -H "Content-Type: application/json"
    curl -X GET http://localhost:9000/$domain;format="lower"$/ping
    curl -X GET http://localhost:9000/$domain;format="lower"$/version

# Configuration

    TODO setup and document

# Metrics

    TODO setup and document

# License

This code is open source software licensed under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0.html).
