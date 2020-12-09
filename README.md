# JPQL Left Join POC

Pequeno exemplo de como utilizar LEFT JOIN em uma consulta JPQL. Trata-se de uma API extremamente simples, criada com SpringBoot.

## Inicialização

Pela IDE de sua preferência (Eclipse, STS, IntelliJ, etc)

Via maven
> mvn spring-boot:run

Via Java
> mvn clean package \
> java -jar target/jpqlleftjoin-0.0.1-SNAPSHOT.jar 

## Banco de dados

A aplicação utiliza o banco H2 em memória. Basta iniciar a aplicação e enviar requisições. Por ser um banco em memória, ao encerrar a aplicação os dados são perdidos.

## Postman

Importe [esse arquivo](https://github.com/Tutoria-Algaworks/jpqlleftjoin/blob/master/.postman/JPQL%20Left%20Join.postman_collection.json) (está no próprio projeto) como uma coleção no Postman para enviar requisições rapidamente.
