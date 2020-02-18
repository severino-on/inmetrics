Feature: Tela de Login 

Scenario Outline: Login com sucesso 
	Given Entrar na url 
	And clicar login 
	And informar usuario "<usuario>"
	When informar a senha "<senha>"
	And clico login 
	Then visualizo a pagina principal 
	Examples:
	| usuario | senha |
	| bill    | 1234 |