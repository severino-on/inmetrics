Feature: Tela de Login 

Scenario Outline: Login com sucesso 
	Given Entrar na url 
	And clicar login 
	And informar usuario "<usuario>"
	When informar a senha "<senha>"
	And clico login 
	Then clico em acionar task
	And informar titulo da task "<titulo_task>"
	And selecionar data limite
	And hora limite
	And informar descricao sobre a task "<descricao_task>"
	And clico no botao salvar
	
	Examples: 
	| usuario | senha | titulo_task | descricao_task |
	| bill    | 1234  | automação inmetrics    | automatizar rotina do site da empresa |
