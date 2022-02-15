# API REST de consulta a dados de pacientes

### Projeto criado para o processo seletivo da empresa Anlix

- Nome: Hospital Web
- Estágio: Finalizado
- Linguagem de Programação: Java 11 LTS
- Banco de Dados Relacional: H2 Database
- Frameworks Back-End: Spring Boot, Spring Web, Spring Data Jpa, Spring MVC, Lombok, Hibernate
- Frameworks Front-End: Thymeleaf e Materialize

### Funções implementadas

- [x] Consultar em uma única chamada, todas as características de um paciente, com os valores mais recentes de cada uma
- [x] Consultar pacientes que contenham um nome ou parte de um nome a ser especificado na chamada da API
- [x] Exportar os dados do paciente para arquvio excel;

### Como executar o projeto

Clone o repositório:
```
https://github.com/gabrielszg/patientsapi
```
Faça o download do OpenJDK 11:
```
https://adoptium.net/?variant=openjdk11&jvmVariant=hotspot
```
Faça o download do Maven:
```
https://dlcdn.apache.org/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.zip
```
Configure as variáveis de ambiente (tutorial):
```
https://dicasdejava.com.br/como-instalar-o-maven-no-windows/
```
Configure o Banco de dados:
   - Na pasta \src\main\resources localize o arquvivo "application.properties", abra com um editor de texto e altera a seguinte linha:
 
     ```
     spring.datasource.url=jdbc:h2:file:"coloque o seu diretorio raiz do projeto com /banco.db no final"
     ```
   - Salve.
  
Abra o Prompt de Comando ou Power Shell na pasta raiz do projeto e digite:
```
mvn spring-boot:run
```
Abra o navegador de sua preferência e digite o comando:
```
localhost:8085/
```
### Arquitetura

- O projeto divide-se em pacotes (cada um com suas classes):
   - Controllers = responsáveis pela comunicação com o banco de dados no back-end;
   - Entities = classes que irão compor a tabelas do banco de dados com relacionamento OneToOne;
   - Model = faz a integração com a página Web;
   - Repositories = interface que extendem a interface JpaRepository para utilização dos métodos POST, GET e DELETE.

### Autor

- Gabriel Gonçalves
