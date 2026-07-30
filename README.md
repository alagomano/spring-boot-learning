# Workshop Management API - Projeto de Aprendizado Spring Boot

> API REST desenvolvida com Spring Boot para aprendizado de desenvolvimento backend utilizando Java, Spring Data JPA, Hibernate e arquitetura em camadas.

## 📖 Sobre o projeto

O **Workshop Management API** é um projeto desenvolvido durante meus estudos de **Spring Boot**, com o objetivo de aprender a construir APIs REST utilizando as principais tecnologias do ecossistema Java.

Embora seja baseado em um projeto guiado, todo o código foi desenvolvido, testado e versionado por mim, servindo como base para consolidar conhecimentos que serão aplicados posteriormente em um projeto próprio de maior porte.

Durante o desenvolvimento foram explorados conceitos fundamentais do Spring Framework, como injeção de dependências, persistência de dados com JPA/Hibernate, tratamento global de exceções e construção de uma arquitetura organizada em camadas.

---

## 🚀 Tecnologias utilizadas

* Java 25
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* Maven
* Banco de dados H2

---

## 🏛 Arquitetura

O projeto segue uma arquitetura em camadas, separando responsabilidades entre os diferentes componentes da aplicação.

```
src/main/java/com/demo/workshop_management_api
├── WorkshopManagementApiApplication.java
├── config
├── entities
├── enums
├── repositories
├── resources
├── services
│   └── exceptions

```

### Responsabilidades

* **WorkshopManagementApiApplication** → Classe principal responsável por inicializar a aplicação Spring Boot.
* **config** → Configurações da aplicação e carga inicial de dados para o ambiente de testes.
* **entities** → Entidades que representam o modelo de domínio.
* **enums** → Enumerações utilizadas pelas entidades.
* **repositories** → Camada de acesso aos dados utilizando Spring Data JPA.
* **services** → Camada de regras de negócio e lógica da aplicação.
* **resources** → Controladores REST responsáveis pelos endpoints da API.
* **services.exceptions** → Exceções personalizadas utilizadas pela camada de serviço.\

---

## 📚 Conceitos estudados

Durante o desenvolvimento foram praticados:

* Arquitetura em camadas
* API REST
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate ORM
* Injeção de Dependências
* CRUD completo
* Tratamento global de exceções
* Banco de dados H2
* PostgreSQL
* Maven
* Serialização JSON
* Relacionamentos entre entidades
* Versionamento com Git

---

## 🗂 Modelo de domínio

O projeto possui as seguintes entidades:

* User
* Order
* Product
* Category
* OrderItem
* Payment

Relacionamentos implementados:

* One-to-Many
* Many-to-One
* Many-to-Many
* Many-to-Many com atributos extras
* One-to-One

---

## ⚙ Funcionalidades

### Usuários

* Buscar todos os usuários
* Buscar usuário por ID
* Inserir usuário
* Atualizar usuário
* Remover usuário

### Pedidos

* Buscar todos os pedidos
* Buscar pedido por ID

### Produtos

* Buscar todos os produtos
* Buscar produto por ID

### Categorias

* Buscar todas as categorias
* Buscar categoria por ID

---

## 🛠 Tratamento de exceções

A API possui tratamento centralizado utilizando `@ControllerAdvice`.

Exceções implementadas:

* ResourceNotFoundException
* DatabaseException

Respostas padronizadas contendo:

* Timestamp
* Código HTTP
* Tipo do erro
* Mensagem
* Caminho da requisição

---

## ▶ Como executar

### Pré-requisitos

* Java 25+
* Maven

### Clonar o repositório

```bash
git clone https://github.com/alagomano/workshop-management-api.git
```

### Entrar no projeto

```bash
cd workshop-management-api
```

### Executar

```bash
./mvnw spring-boot:run
```

A aplicação ficará disponível em:

```
http://localhost:8080
```

---

## 🔍 Exemplos de endpoints

```
GET    /users
GET    /users/{id}

POST   /users

PUT    /users/{id}

DELETE /users/{id}

GET    /orders
GET    /orders/{id}

GET    /products
GET    /products/{id}

GET    /categories
GET    /categories/{id}
```

---

## 📈 Aprendizados

Este projeto foi fundamental para compreender na prática:

* organização de projetos Spring Boot;
* desenvolvimento de APIs REST;
* persistência com Spring Data JPA;
* mapeamentos entre entidades;
* tratamento de exceções;
* arquitetura em camadas;
* utilização do Hibernate como ORM.

Os conhecimentos adquiridos aqui servirão de base para a evolução do meu projeto principal de gerenciamento de oficina mecânica, desenvolvido inicialmente com JDBC, que será migrado para Spring Boot e JPA/Hibernate.

---

## 👨‍💻 Autor

**Nicolas Brayan**

* GitHub: https://github.com/alagomano
* LinkedIn: https://www.linkedin.com/in/nicolas-brayan
