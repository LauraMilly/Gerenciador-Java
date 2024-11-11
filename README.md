Gerenciador de Frota de Veículos:

O sistema permite o armazenamento e a consulta de diferentes tipos de veículos, como carros e motos, e realiza o cálculo do valor do seguro de cada um, além de gerenciar a realização de manutenções periódicas.

<h1>Funcionalidades:</h1>

°Cadastro de veículos: Suporta carros e motos, com informações como placa, ano, número de portas (para carros) e cilindrada (para motos).
°Cálculo do seguro: O valor do seguro é calculado com base nas características de cada veículo.
°Manutenção periódica: Implementa um método para registrar e realizar manutenções nos veículos.
°Interface e Classes Abstratas: O sistema utiliza conceitos de programação orientada a objetos, como classes abstratas e interfaces, para organizar e estruturar o código.

<h1>Estrutura do Projeto:</h1>

Classe Veiculo: Classe abstrata que define os atributos comuns dos veículos e métodos para exibir detalhes e calcular o valor do seguro.
Interface Manutencao: Define o método para realizar manutenções nos veículos.
Classes Carro e Moto: Subclasses de Veiculo que implementam os métodos necessários, incluindo o cálculo do seguro e a execução da manutenção.
Classe GerenciadorVeiculos: A classe principal que gerencia a lista de veículos, exibe seus detalhes e realiza as operações de cálculo de seguro e manutenção.
Tecnologias Utilizadas:
Java (JDK 17 ou superior)
Programação Orientada a Objetos (POO)
Conceitos de abstração, herança e interfaces
Como Executar:
Instale o JDK (Java Development Kit).
Compile o código usando javac GerenciadorVeiculos.java.
Execute o programa com o comando java GerenciadorVeiculos.