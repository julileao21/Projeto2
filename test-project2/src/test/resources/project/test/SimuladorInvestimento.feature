#language: pt

Funcionalidade: Simular investimento na Poupança como um associado

  Cenario: Cadastrar formulário de simulação
  Dado o endereço da API para manter o cadastro de simulação
  Quando realizar uma requisição para cadastrar um valor
  Então a API irá retornar os dados do cadastro da simulação respondendo o código 201

  Cenario: Consultar o formulário de simulação
  Dado o endereço da API para manter o cadastro do associado
  Quando realizar uma requisição de consulta passando o ID do cadastro
  Então a API irá retornar os dados do associado corresponte respondendo o código 200

  Cenario: Preencher o formulário de simulação com valor menor que '20'
  Dado o endereço da API para manter o cadastro de simulação
  Quando realizar uma requisição para cadastrar um valor menor que 20
  Então a API irá retornar os dados incorretos respondendo o código 400
