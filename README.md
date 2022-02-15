# API REST de consulta a dados de pacientes

### Projeto criado para o processo seletivo da empresa Anlix

- Nome: Hospital Web
- Estágio: Finalizado
- Linguagem de Programação: Java 11 LTS
- Banco de Dados Relacional: H2 Database
- Frameworks Back-End: Spring Boot, Spring Web, Spring Data Jpa, Lombok, Hibernate
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

Faça o download do java:
```
https://www.oracle.com/java/technologies/downloads/#java11
```
Configure as variáveis de ambiente (tutorial):
```
https://mauriciogeneroso.medium.com/configurando-java-4-como-configurar-as-vari%C3%A1veis-java-home-path-e-classpath-no-windows-46040950638f
```

Abra o Prompt de comando na pasta target do projeto e digite:
```
java -jar patientsapi-0.0.1-SNAPSHOT.jar
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
