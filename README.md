## SISTEMA CADASTRO DE ANÚNCIOS
  
### O sistema faz cadastro de anúncios, Listagem dos dados (relatório dos anúncios).

## Tecnologia Ultilizada:

### Banco de dados: 
MYSQL
  
### Liguagem de Programação:
Java

### IDE: 
NetBeans     

**Para acessar a tela de cadastro, precisa criar a tabela no banco MYSQL(script da tabela) **

**use projetojava;
CREATE TABLE `anuncio` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `nome_anuncio` varchar(255) DEFAULT NULL,
  `cliente` varchar(255) DEFAULT NULL,
  `dtInicio` varchar(100) DEFAULT NULL,
  `dtTermino` varchar(100) DEFAULT NULL,
  `valor` double(15,2) DEFAULT NULL,
  `visualizacao` integer(10) DEFAULT NULL,
  `cliques` integer(10) DEFAULT NULL,
  `compartilhamentos` integer(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;**

**Para acessar a tela de cadastro, no NetBeans na pasta src > gui > TelaPrincipal**

![image](https://user-images.githubusercontent.com/77024829/118174235-f2b8d380-b404-11eb-9448-479bbe0d5ab6.png)

**Para cadastrar os anúncios na tela "Cadastrar anúncio"**

![image](https://user-images.githubusercontent.com/77024829/118174477-40cdd700-b405-11eb-83ea-5b88902bee8d.png)

**Para pesquisar os anúncios cadastrados em "Relatório de anúncios"**

![image](https://user-images.githubusercontent.com/77024829/118175028-f1d47180-b405-11eb-8226-76662831976b.png)

**Para mostrar os anúncios cadastrados clica em "Pesquisar"**

![image](https://user-images.githubusercontent.com/77024829/118174812-ac17a900-b405-11eb-928c-f183fd6f22db.png)


