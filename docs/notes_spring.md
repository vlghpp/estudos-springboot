# Notas de estudos sobre o framework Springboot


### Á duvida (?)
Sobre a dúvida que comecei assim que vi uma aplicação Springboot com o exemplo do RestController do hello (Get Started site spring)

`Como o Springboot sabe que tem uma API RESTful rodando se não tem nenhum server explicitamente como no Node.js, em que ém necessário fazer o server escutar uma porta e usar o roteamento que foi cadastrado préviamente dentro de uma pasta chamada routes (comumente usada)?`

R: Então vem a lógica do Springboot, como ele funciona por trás dos panos: ao seguinte passo dos meus estudos notei que ele o application run (método que garante a inicialização do spring) usa um decorador chamado `@SpringBootApplication` esse decorador roda com 3 principais funcionalidades:
- `@Configuration`: Marca a classe como uma fonte de definições de beans para o contexto da aplicação. Permite que o Spring detecte configurações definidas pelo usuário
- `@EnableAutoConfiguration`: Ativa o mecanismo de auto-configuração do Spring Boot, que tenta configurar automaticamente a aplicação com base nas dependências encontradas no classpath.
- `@ComponentScan`: (RESPOSTA DA DÚVIDA) Aqui que está mágica esse decorator faz com que a aplicação enxergue todos os seus submódulos, ou seja, todas pastas abaixo dela com esses decoradores (`@Controller`, `@Service`, `@Repository`) então os carrega.

### Gestão de dependencias - Starters

Pelo que eu entendi o Springboot lida com as dependencias através de starters que se localizam em build.gradle (oq eu mais estou acostumado a usar) lá ele faz a importação desse starter, mas por trás dele há outras dependências.

### Autoconfiguration
