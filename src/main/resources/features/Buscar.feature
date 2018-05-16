#language: pt
#Version: 1.0
#Encoding: iso-8859-1

Funcionalidade: Buscar elementos de perguntas frequentes, perguntas exibidas e valores da tela 

	Contexto: Realizacao do acesso inicial como pre-requisito
	
		Dado que estou na pagina inicial		
		
	@ID01 @ExecutarCenarios
	
	Cenario: Realizar a��o de pesquisa de perguntas frequentes
	
		Quando acessar categoria de ajuda
	
		Entao apresenta resultado das perguntas frequentes e realiza print	
		
		
	@ID02 @ExecutarCenarios	
	
	Cenario: Realizar pesquisa "Institucional" na se��o "Loja F�sica"

	 Quando acessar a opcao institucional na secao de loja fisica
	 
	 Entao validar as perguntas exibidas na tela
   
	 
	 @ID03 @ExecutarCenarios
	 
	Cenario: Realizar pesquisa do Telefone do Cart�o C&A	
	 
	 Quando acessar opcao "Telefone do Cart�o C&A"
	 
	 E salvar a imagem do cartao 
	 
	 Entao validar os telefones
