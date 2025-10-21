#Author: Samuel Xavier

@qualquercoisa  @formularioAberturaContaPJ
Feature: Abertura de conta PF
  

  @formularioaberturadecontapf 
  Scenario Outline: Validando fluxo de cadastro de abertura de conta

    Given que acesse o ambiente de testes "https://inter.co/"
    When clicar no botao abra sua conta
    And preencher o formulario de abertura de conta com <nome> <telefone> <cpf> <Data nascimento> <Email>
    And clicar no checkbox autorizando
    And clicar no botao continuar
    Then valido o texto Prontinho recebemos os seu dados
    
    Examples:

       |nome           |telefone     | cpf            | Data nascimento | Email              | 
       |"Samuel Xavier"|"11958639457"|"51050375025"   |"21021990"       |"teste@teste.com.br"|
       |"Samuel Xavier"|"11958639457"|"51050375025"   |"21022017"       |"teste@teste.com.br"|     
       
       
       @formularioAberturaContaPJ
    Scenario Outline: Validando fluxo de cadastro de abertura de conta PJ

    Given que acesse o ambiente de testes "https://conta-digital-pj.inter.co/login"
    When clicar no botao abrir conta
    And preencher o formulario de abertura de conta com <nome> <CNPJ>
    And clicar no checkbox autorizando
    And clicar no botao continuar
   
    Examples:

       |nome           |CNPJ                |
       |"Samuel Xavier"|"94.474.503/0001-42"|

