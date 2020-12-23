# SaltyNote Service

![Maven Build](https://github.com/SaltyNote/saltynote-service/workflows/Maven%20Build/badge.svg)
![Deploy](https://github.com/SaltyNote/saltynote-service/workflows/Deploy/badge.svg)
![CodeQL](https://github.com/SaltyNote/saltynote-service/workflows/CodeQL/badge.svg)

## Overview

This is the backend service for [saltynote](https://saltynote.com). It
uses [JWT](https://auth0.com/docs/tokens/json-web-tokens) for authentication. As high-level, this service provides APIs
for:

1. User (signup, login, token refresh, token cleanup, password reset)
2. Note (create, update, fetch and delete)

For more information about the endpoints, please refer the [swagger ui(*
readonly*)](https://api.saltynote.com/swagger-ui/) for more details.

![Swagger UI](./docs/images/swagger-ui.png)

## How to Run

This is a standard spring boot project with Maven, so you can use maven command to run it. While the simplest & quickest
way is to run `./start.sh`.

### Configuration

1. The service relies on database to store `user/note` information. In development env, you can run `docker-compose up`
   to start mariadb (*add `-d` if you want start it as “detached” mode*).
2. This service also need smtp service to send email. In development env, you can configure it with your gmail account.
   See more details here； https://git.io/JLP6q
