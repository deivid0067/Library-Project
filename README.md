# Sistema de Gestão de Livraria (Java OOP)

Projeto desenvolvido em Java para praticar conceitos de Programação Orientada a Objetos (OOP). O sistema tem como objetivo gerenciar livros, clientes e empréstimos, utilizando princípios como encapsulamento, herança e polimorfismo para criar uma aplicação modular e escalável.

## Funcionalidades

- **Cadastro de livros e autores:** Registre informações sobre os livros e seus autores.
- **Gestão de clientes:** Cadastre e edite dados dos clientes da livraria.
- **Empréstimos e devoluções:** Gerencie os empréstimos e devoluções de livros pelos clientes.
- **Pesquisa de livros e autores:** Busque livros por título, autor ou gênero.
- **Relatórios simples:** Gere relatórios sobre livros e empréstimos.

## Arquitetura do Projeto

A arquitetura do sistema é organizada de forma modular, utilizando o padrão de Programação Orientada a Objetos (OOP). A estrutura do projeto é a seguinte:

### **models/**
Contém as classes que representam as entidades do sistema:
- **Client.java**: Representa os clientes da livraria.
- **Book.java**: Representa os livros disponíveis para venda ou empréstimo.
- **Author.java**: Representa os autores dos livros.
- **Loan.java**: Representa os empréstimos realizados pelos clientes.

### **services/**
Contém as classes responsáveis pela lógica de negócios do sistema:
- **Library.java**: Controla as interações entre livros, clientes e empréstimos.
- **ClientService.java**: Gerencia as operações relacionadas aos clientes (cadastro, edição, etc.).
- **LoanService.java**: Gerencia os empréstimos de livros.
- **BookService.java**: Gerencia o catálogo de livros e o controle de estoque.

### **Main.java**
Classe principal que inicializa e executa o sistema.
