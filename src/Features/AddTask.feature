Feature: Cadastrar Task
 
Scenario Outline: cadastro  de taks com sucesso 

	Given que o usuario esteja no formulario de cadastro de task
	And informar titulo da task "<titulo_task>"
	And selecionar data limite
	And hora limite
	And informar descricao sobre a task "<descricao_task>"
	Examples: 
		| titulo_task | descricao_task |
		| automação inmetrics    | automatizar rotina do site da empresa |