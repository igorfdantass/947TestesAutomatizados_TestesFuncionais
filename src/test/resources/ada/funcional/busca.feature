#language: pt

Funcionalidade: Realizar buscas no Google
  Inserir qualquer texto que seja descrição da funcionalidade
  Aqui embaixo tbm
  Aqui tbm

  Cenário: Validar pesquisa simples com click
    Dado que usuario acessa página home
    Quando digitar 'naruto'
    E clicar no botão pesquisar
    Entao deve retornar 'naruto'

  @ignore
  Cenário: Validar pesquisa simples com enter
    Dado que usuario acessa página home
    Quando digitar 'naruto'
    Quando teclar enter
    Entao deve retornar 'naruto'

#  Cenário: cenario2
#    Dado qualquer coisa
#    Quando digitar 'cabelo'
