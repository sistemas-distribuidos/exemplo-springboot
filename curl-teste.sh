#!/bin/bash

curl http://localhost:8080/contato

curl http://localhost:8080/contato/1

curl -i -X POST -H "Content-Type:application/json" -d "{  \"nome\" : \"Lucas Furtado\",  \"telefone\" : \"12233\", \"grupo.id\":1 }" http://localhost:8080/contato

curl http://localhost:8080/contato/search/findByNomeContainsIgnoreCase?nome=rom

curl -i -X PUT -H "Content-Type:application/json" -d "{  \"nome\" : \"Lucas Furtado P Cantanhede\",  \"telefone\" : \"12233\", \"grupo.id\":1 }" http://localhost:8080/contato/4

curl -X DELETE http://localhost:8080/contato/4