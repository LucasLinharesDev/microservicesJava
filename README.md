# Microservices Java
Microserviços em Java com Spring, Docker e PostgresSql.

Nesse projeto, temos 2 microserviços: user e email, 
e também uma pasta docker com um docker-compose.yaml para subir o postgres. 

### Configurando o projeto:

       Na pasta raiz, abra a pasta docker, 
       dentro dessa pasta clique com o botão direito e execute como gitbash.
       
       digite o comando: docker-compose up -d

        - Esse comando vai iniciar um Container do Postgres no seu docker
        - Após isso, abra a ferramenta Dbeaver e conecte nesse container do docker
        - Depois de se conectar, crie 2 bancos de dados: db-user e db-email
        - Prontinho, agora você já pode executar a aplicações.

