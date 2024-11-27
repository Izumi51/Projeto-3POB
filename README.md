Proposta de Trabalho de Programação: Sistema de Gerenciamento de Funcionários
Objetivo: Desenvolver um sistema de gerenciamento de funcionários que permita o cadastro,
consulta, atualização e exclusão de dados de funcionários. O sistema deve utilizar conceitos de
herança, interfaces, abstração, ArrayList para armazenamento temporário de dados e persistência
em arquivos para armazenamento permanente. O projeto deve seguir o padrão arquitetural MVC
(Model-View-Controller) e aplicar as práticas de Clean Code.

Descrição do Problema
A empresa TechCorp deseja implementar um sistema para gerenciar informações sobre seus
funcionários, que incluem desenvolvedores, gerentes e treinadores. Cada funcionário possui dados
como nome e salário. Dependendo do cargo, os funcionários têm responsabilidades diferentes:
• Desenvolvedores: Realizam atividades de codificação e resolução de problemas técnicos.
• Gerentes: Organizam a equipe e conduzem reuniões.
• Treinadores: Ensinam novas tecnologias e motivam a equipe.
• Gerente Desenvolvedor: Possui responsabilidades de desenvolvedor e gerente.

Estrutura do Projeto
Os alunos deverão criar um sistema que separe claramente a lógica de negócios (Model), a interface
com o usuário (View), e o controle de fluxo (Controller) de acordo com o padrão MVC.
1. Model (Modelo): Representa as entidades e classes abstratas do sistema, como Funcionario,
   Desenvolvedor, Gerente, Treinador e GerenteDesenvolvedor.
2. View (Visão): Responsável pela interface com o usuário. A View deve capturar dados e exibir
   informações sobre os funcionários.
3. Controller (Controlador): Controla o fluxo de dados entre o Model e a View, incluindo a lógica
   de adicionar, listar, atualizar e remover funcionários.

Requisitos do Projeto
1. Cadastro de Funcionários:
   o Permitir o cadastro de desenvolvedores, gerentes, treinadores e gerente
   desenvolvedores.
   o Cada tipo de funcionário possui atributos e métodos específicos baseados nas
   interfaces e na classe abstrata Funcionario.

2. Armazenamento com ArrayList e Persistência em Arquivo:
   o Utilizar ArrayList para armazenar temporariamente a lista de funcionários durante a
   execução.

o Persistir os dados em um arquivo de texto para que o sistema possa recuperar os
funcionários cadastrados ao reiniciar.

3. Interfaces e Herança:
   o Utilizar interfaces para definir as responsabilidades de cada tipo de funcionário
   (Desenvolve, Gerencia, Treina).
   o Utilizar herança com uma classe abstrata Funcionario que define os atributos e
   métodos comuns a todos os funcionários.

4. Padrão MVC:
   o Organizar o projeto em pacotes de acordo com o padrão MVC.
   o Model: Contém as classes Funcionario, Desenvolvedor, Gerente, Treinador e
   GerenteDesenvolvedor.
   o Controller: Contém a lógica de negócio para manipulação dos dados dos funcionários.
   o View: Interage com o usuário para inserção e exibição dos dados.
5. Princípios de Clean Code:
   o Aplicar nomes claros e significativos para classes, métodos e variáveis.
   o Dividir o código em métodos e classes de acordo com a responsabilidade única.
   o Evitar métodos longos, criando funções auxiliares sempre que necessário.
   o Manter o código limpo e organizado, com tratamento de exceções e validação de
   entradas.

Estrutura das Classes
Detalhes das Classes e Interfaces
- Classe Abstrata Funcionario:
  - o Atributos: nome (String), salario (double).
  - o Métodos: getNome(), getSalario(), receberAumento(double aumento),
  mostrarDetalhes() (abstrato).

- Interface Desenvolve:
  - o Métodos: codar(), resolverProblemas().
- Interface Gerencia:
  - o Métodos: organizarEquipe(), conduzirReunioes().
  - Interface Treina:
  - o Métodos: ensinarTecnologia(), motivarEquipe().
- Classes Específicas:

  - o Desenvolvedor: Implementa Funcionario e Desenvolve.
  - o Gerente: Implementa Funcionario e Gerencia.
  - o Treinador: Implementa Funcionario e Treina.
  - o GerenteDesenvolvedor: Implementa Funcionario, Gerencia e Desenvolve,
  combinando responsabilidades.

Requisitos de Implementação
1. Cadastrar Funcionário:
   o O sistema deve permitir que o usuário insira informações específicas para cada tipo de
   funcionário.
2. Listar Funcionários:
   o O sistema deve exibir uma lista de todos os funcionários com seus detalhes
   específicos.

3. Atualizar Dados do Funcionário:
   o Permitir atualizar o nome e o salário de um funcionário existente.
4. Excluir Funcionário:
   o Remover um funcionário da lista, tanto do ArrayList quanto do arquivo de persistência.
5. Recuperar Dados de Funcionários de Arquivo:
   o Ao iniciar o sistema, carregar os dados do arquivo e armazená-los no ArrayList para
   permitir manipulação em tempo de execução.

Instruções para Implementação
1. Crie Pacotes:
   o model: Contém classes que representam dados e lógica do domínio (Funcionario,
   Desenvolvedor, Gerente, etc.).
   o view: Contém classes que lidam com a interface do usuário (FuncionarioView, por
   exemplo).
   o controller: Contém classes que gerenciam a comunicação entre o Model e a View
   (FuncionarioController).

2. Organize o Código:
   o Mantenha métodos curtos e claros, cada um com uma única responsabilidade.
   o Use exceções para tratar erros, como problemas de entrada do usuário ou falhas na
   leitura/escrita de arquivos.

3. Uso de Interfaces e Abstração:
   o Implemente interfaces para definir as responsabilidades (ex.: Desenvolve para
   desenvolvedores, Gerencia para gerentes).
   o Utilize uma classe abstrata para definir os atributos e métodos comuns a todos os
   funcionários.
4. Persistência de Dados:
   o Ao adicionar, atualizar ou excluir um funcionário, atualize o arquivo de texto para
   garantir que os dados estejam salvos permanentemente.

Entrega do Projeto
O projeto final deve incluir:
1. Código-fonte: Estruturado em pacotes e organizado de acordo com o padrão MVC.
2. Arquivo de Persistência: Um arquivo de texto que armazena os dados dos funcionários.
3. Documentação: Diagrama de Classes do projeto.

Avaliação
Os projetos serão avaliados com base nos seguintes critérios:
- Funcionalidade: O sistema realiza todas as operações de cadastro, atualização, listagem e
exclusão de funcionários.
- Organização e Estrutura: O código está organizado em pacotes MVC, e as classes são
divididas de acordo com as responsabilidades.
- Aplicação de Conceitos: Uso correto de herança, interfaces, abstração e tratamento de
exceções.
- Código Limpo: Nomes claros, métodos curtos, e responsabilidade única para cada classe e
método.
No projeto proposto, o arquivo de texto servirá para armazenar permanentemente os dados dos
funcionários, permitindo que eles sejam recuperados quando o sistema for reiniciado. Para isso, o
arquivo de texto deve conter as informações essenciais de cada funcionário, incluindo detalhes
específicos de acordo com seu tipo (Desenvolvedor, Gerente, Treinador, etc.).
Estrutura e Dados a Armazenar no Arquivo de Texto
1. Dados Comuns a Todos os Funcionários:
   o ID ou identificador único (para identificar e referenciar funcionários no sistema).
   o Nome do funcionário.

o Salário.
2. Dados Específicos por Tipo de Funcionário:
   o O tipo do funcionário (ex.: Desenvolvedor, Gerente, Treinador, GerenteDesenvolvedor)
   deve ser armazenado para que, ao ler o arquivo, o sistema saiba recriar o objeto
   correto.

Exemplo de Estrutura de Dados no Arquivo
Cada linha do arquivo de texto pode representar um funcionário, com os campos separados por um
delimitador, como ponto e vírgula (;). Um exemplo de estrutura de linha pode ser:
[ID];[Tipo];[Nome];[Salário]
Exemplo de Conteúdo do Arquivo
1;Desenvolvedor;Alice;5000.00
2;Gerente;Bob;8000.00
3;Treinador;Carlos;6000.00
4;GerenteDesenvolvedor;Daniel;10000.00
Detalhes Específicos
- ID: Um número único para identificar o funcionário (ex.: 1, 2, 3).
- Tipo: A classificação do funcionário (Desenvolvedor, Gerente, etc.).
- Nome: O nome do funcionário.
- Salário: O valor do salário do funcionário.
Operações no Arquivo
1. Escrita:
   o Ao adicionar um novo funcionário no sistema, uma nova linha deve ser escrita no
   arquivo com seus dados.
   o Ao alterar um funcionário, o arquivo deve ser atualizado para refletir a mudança.
   o Ao excluir um funcionário, sua linha deve ser removida do arquivo.
2. Leitura:
   o Ao iniciar o sistema, o arquivo deve ser lido e cada linha processada para recriar os
   objetos de Funcionario, Desenvolvedor, Gerente, etc., e adicioná-los ao ArrayList.