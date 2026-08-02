# Biblioteca

Este repositório contém um projeto em Java para simular o gerenciamento de uma biblioteca por meio de um menu interativo no console. O sistema permite cadastrar, listar, alterar e remover livros e alunos, usando conceitos básicos de orientação a objetos.

## Funcionalidades implementadas

- Cadastro de livros e alunos;
- remoção de livros e alunos por ID;
- listagem completa do acervo e dos alunos cadastrados;
- alteração do nome de livros e alunos;
- validação de entradas do usuário;
- prevenção de IDs duplicados para evitar cadastros repetidos;
- tratamento de entradas inválidas, como IDs negativos ou não numéricos.

## Menu do sistema

O programa oferece as seguintes opções no console:

1. Adicionar livro
2. Remover livro
3. Listar livros
4. Adicionar aluno
5. Remover aluno
6. Listar alunos
7. Modificar livro
8. Modificar aluno
9. Sair

## Estrutura das classes

- `Biblioteca`: responsável por armazenar os registros de livros e alunos e pelas operações de CRUD.
- `Livro`: representa uma obra com nome e código de cadastro.
- `Aluno`: representa um estudante com nome e identificador.
- `Main`: contém o fluxo principal do programa e o menu interativo.

## Regras de validação

- nomes vazios ou em branco são recusados;
- IDs devem ser maiores que zero;
- não é permitido cadastrar um livro ou aluno com um ID já existente.

## Como executar

1. Abra o projeto em uma IDE Java, como IntelliJ IDEA ou VS Code.
2. Compile e execute a classe `Main`.
3. Use o menu interativo para gerenciar os registros.

## Observação

O projeto foi desenvolvido como exemplo de estruturação simples em Java para prática de classes, listas, validação de dados e interação com o usuário em console.
