# Descrição do Projeto

Este projeto tem como objetivo a xecução de um aplicativo de Bloco de Notas, sendo um desafio.

# Desafios Enfrentados no Projeto
Desenvolver o back-end deste projeto foi um grande desafio, pois eu não tinha experiência prévia com Spring Boot
para desenvolvimento de APIs. Desde o início, tive que aprender conceitos fundamentais,
como injeção de dependência, mapeamento de entidades com JPA e criação de endpoints RESTful, além de entender a configuração
de um servidor web com Spring.

Além disso, a curva de aprendizado foi intensa por conta das configurações iniciais e dos detalhes de configuração de segurança,
que exigiram muita pesquisa e leitura de documentação. Embora o processo tenha sido desafiador, conseguir superar esses obstáculos
me trouxe um conhecimento valioso sobre a estrutura de projetos back-end em Java e a arquitetura Spring Boot, além de fortalecer minhas
habilidades em desenvolvimento de APIs e integração com banco de dados.

# Tipo de Mudança

Marque a caixa correspondente ao tipo de mudança que esta PR faz:

- [x] Nova funcionalidade

# Alocação da API e Banco de Dados no Railway
Minha API e o banco de dados foram implantados e estão funcionando online na plataforma Railway. A escolha pelo Railway foi motivada pela facilidade
de deploy contínuo e pela integração prática com bancos de dados.

A API foi configurada para responder a requisições externas, e o banco de dados também está acessível para o armazenamento e recuperação
de dados em tempo real, facilitando o acesso remoto e o funcionamento online da aplicação. Com a infraestrutura do Railway, posso garantir a estabilidade,
segurança e escalabilidade para o projeto, assegurando que o ambiente de produção esteja constantemente disponível para uso.

# Passos para Testar

1. 		[Instalação do Postman]

			Baixe e instale o Postman.
			Após a instalação, abra o Postman e faça login (ou crie uma conta, caso ainda não tenha uma).
			
2. 		[Download do Repositório]

			Abra o terminal da sua IDE ou do sistema e navegue até o diretório onde você deseja clonar o repositório.
			Use o comando abaixo para clonar o repositório para o seu ambiente local:
			
			git clone https://github.com/RealC0/core-notes

3. 		[Configuração e Teste dos Endpoints no Postman]

			Abra o Postman e crie uma nova Request.
			Insira a URL do endpoint:
			
			https://core-notes-production.up.railway.app/notes
			
			Selecione o método HTTP adequado (GET, POST, PUT, DELETE, etc.) de acordo com o que deseja testar.
			Para endpoints que exigem dados (como POST ou PUT), vá para a aba Body no Postman:
			Selecione raw e defina o tipo como JSON.
			Insira o payload JSON necessário no campo de texto. Exemplo:
			
			{
				 "title": "Teste",
				 "content": "Executando um teste de conteudo no database",
				 "favorite": false,
				 "color": "white"
			}
			
			
4.		[Envio da Requisição e Verificação da Resposta]

			Clique no botão Send para enviar a requisição.
			Verifique a resposta na seção Response do Postman. Ela deve mostrar o status HTTP (200, 404, etc.) e o corpo da resposta retornado pela API.
			Para testes adicionais, ajuste os dados ou parâmetros e envie novamente para validar diferentes cenários.