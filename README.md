
# admin-catalogo

Este projeto foi desenvolvido como parte do curso Fullcycle 3.0 e consiste em um microsserviço para administração de um catálogo de vídeos, utilizando princípios de Clean Architecture, Domain-Driven Design (DDD) e Test-Driven Development (TDD).


## Estrutura do Projeto

O projeto segue os princípios da Clean Architecture, separando responsabilidades em camadas bem definidas para promover manutenibilidade, testabilidade e independência de frameworks. A estrutura principal está dividida nas seguintes pastas:

* **application**: Contém a lógica de **casos de uso (use cases)**, orquestrando o fluxo da aplicação. Essa camada define **serviços de aplicação** e interage com o domínio para realizar ações específicas, como criar, atualizar, buscar ou remover entidades.

* **domain**: Define o núcleo da lógica de negócio. Contém as entidades (como Category, entre outras) com suas regras de negócio e interfaces de contrato (gateways) que são utilizadas pelas camadas superiores.

* **infrastructure**: Responsável pelos detalhes técnicos e de integração com o mundo externo, como:

    * Implementações concretas dos repositórios (CategoryRepository, etc.).

    * Configurações do Spring Boot.

    * Mapeamentos de banco de dados com JPA/Hibernate.

    * Camada de exposição (REST Controllers).

      Essa camada implementa as interfaces definidas no domínio,      garantindo a inversão de dependência.
## Stack utilizada

**Back-end:**

* **Java:** Linguagem de programação principal do projeto.

* **Gradle:** Ferramenta de automação de build utilizada para gerenciar dependências e tarefas.


## Configuração e Execução do Projeto

Siga os passos abaixo para configurar e executar o projeto em ambiente de desenvolvimento:

1. Clonar o Repositório para sua máquina local
```bash
  git clone https://github.com/o-FM/admin-catalogo.git
```

2. Executar a Aplicação
```bash
  ./gradlew bootRun
```



## Executando Testes

Para executar os testes automatizados do projeto, utilize o seguinte comando
```bash
  ./gradlew test
```


## Considerações Finais

Este projeto foi estruturado seguindo as melhores práticas de desenvolvimento, incluindo Clean Architecture, DDD e TDD. Certifique-se de seguir as instruções acima para configurar e executar o projeto corretamente. Em caso de dúvidas ou problemas, consulte a documentação das ferramentas utilizadas ou entre em contato com os mantenedores do projeto.

