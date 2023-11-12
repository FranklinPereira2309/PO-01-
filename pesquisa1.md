# **Definição de Classe e Objeto:**
Em programação orientada a objetos, uma classe é um modelo para criar objetos. Ela define as propriedades e comportamentos que os objetos de um tipo específico terão. Já um objeto é uma instância de uma classe, ou seja, é uma entidade concreta baseada no modelo definido pela classe.
## **Classes em C++:**
class Carro {
public:
    string Marca;
    string Modelo;
    int ano;
};

class Circulo {
public:
    double raio;
    double Area() {
        return 3.14 * raio * raio;
    }
};
## **Objetos em C++:**
Carro carro1;
carro1.marca = "Toyota";
carro1.modelo = "Corolla";
carro1.ano = 2022;

Circulo circulo1;
circulo1.raio = 5.0;
double area = circulo1.Area();
 
## **Classes em Java:**
public class Livro {
    String titulo;
    String autor;
    int contarPaginas;
}
public class Retangulo {
    double comprimento;
    double largura;
    double Area() {
        return comprimento * largura;
    }
}
## **Objetos em Java:**
Livro livro1 = new Livro();
livro1.titulo = "O Pequeno Príncipe";
livro1.autor = "Antoine de Saint-Exupéry";
livro1.contarPaginas = 96;

Retangulo retangulo1 = new Retangulo();
retangulo1.comprimento = 5.0;
retangulo1.largura = 3.0;
double area = retuangulo1.Area();

# **05 Exemplos de Classes em C++ e Java:**
## **C++:**
class Pessoa {
public:
    string nome;
    int idade;
    string profissao;
};
class Produto {
public:
    string nome;
    float preco;
    int quantidadeEstoque;
};
class Triangulo {
public:
    float ladoA;
    float ladoB;
    float ladoC;
    float calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
};
class Televisao {
public:
    int canalAtual;
    int volume;
    void aumentarVolume() {
        volume++;
    }
    void trocarCanal(int novoCanal) {
        canalAtual = novoCanal;
    }
};
 
class Quadrado {
private:
    float lado;
public:
    float calcularArea() {
        return lado * lado;
    }
    float calcularPerimetro() {
        return 4 * lado;
    }
};
## **Java:**
public class Aluno {
    String nome;
    int idade;
    String curso;
}
public class Pedido {
    String numeroPedido;
    float valorTotal;
    boolean pago;
}
public class Circulo {
    double raio;
    double calcularArea() {
        return 3.14 * raio * raio;
    }
}
public class ContaBancaria {
    String titular;
    double saldo;
    void depositar(double valor) {
        saldo += valor;
    }
    void sacar(double valor) {
        saldo -= valor;
    }
}
public class Animal {
    String especie;
    int idade;
    String som;
    void fazerSom() {
        System.out.println("O " + especie + " faz " + som);
    }
}
