# Componente Atômico - Processamento de Dados em Tempo Real

O Componente Atômico api-atom-realtime-sensor é responsável por receber os dados processados pelo Orquestrador (Orch) e salvá-los em tempo real em uma base de dados Cassandra. Utilizando a arquitetura hexagonal, este componente oferece escalabilidade, confiabilidade e eficiência no armazenamento dos dados provenientes dos sensores IoT.

## Pré-requisitos

- JDK 11 ou superior instalado
- Maven 3.x instalado
- Cluster Cassandra configurado e acessível

## Configuração

1. Clone o repositório para sua máquina local:

   ```
   git clone https://github.com/seu-usuario/componente-atomico.git
   ```

2. Configure as propriedades do Cassandra:

   Edite o arquivo `application.properties` no diretório `src/main/resources/`:

   ```properties
   # Configurações do Cassandra
   spring.data.cassandra.contact-points=localhost:9042
   spring.data.cassandra.keyspace-name=nome-do-keyspace
   ```

   Substitua `nome-do-keyspace` pelo nome do seu keyspace no Cassandra.

## Execução

1. Navegue até o diretório raiz do projeto:

   ```
   cd componente-atomico
   ```

2. Compile o projeto utilizando Maven:

   ```
   mvn clean package
   ```

3. Execute a aplicação Spring Boot:

   ```
   java -jar target/componente-atomico-1.0.0.jar
   ```
