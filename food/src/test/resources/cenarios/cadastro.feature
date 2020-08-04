Feature: Cadastro de novos usuario
  Como futuro cliente do app ifood
  Quero poder cadastrar meus dados no aplicativo
  A fim de que possa usufruir do acesso para efetuar compra de alimentos

  @tag1
  Scenario: Preencher todos os campos e criar conta
    Given um usuario que deseje se cadastrar no app ifood
    When preencher os campos de <e-mail>, <phone number>, <password>
    And clicar no botao <CREATE ACCOUNT>
    And preencher o <codigo de verificacao>
    And clicar no botao <SUBMIT CODE>
    Then exibir a tela de <categories> e <Popular>

  @tag2
  Scenario: Criar conta sem preencher nenhum campo
    Given um usuario que tente se cadastrar no app sem informar nenhum campo
    When clicar no botao <CREATE ACCOUNT>
    And preencher o <codigo de verificacao>
    And clicar no botao <SUBMIT CODE>
    Then exibir a tela de <categories> e <Popular>

  @tag3
  Scenario: Criar conta com o Facebook
    Given um usuario que deseje se cadastrar no app ifood
    When clicar no botao <SIGN UP WITH FACEBOOK>
    And preencher o <codigo de verificacao>
    And clicar no botao <SUBMIT CODE>
    Then exibir a tela de <categories> e <Popular>

  @tag4
  Scenario: Criar conta com o google
    Given um usuario que deseje se cadastrar no app ifood
    When clicar no botao <SIGN UP WITH GOOGLE>
    And preencher o <codigo de verificacao>
    And clicar no botao <SUBMIT CODE>
    Then exibir a tela de <categories> e <Popular>
