# Em programação orientada a objetos, a herança é um conceito fundamental que permite criar uma nova classe (conhecida como subclasse) baseada em uma classe já existente (classe base ou superclasse). A subclasse herda os atributos e métodos da superclasse, permitindo estender seu comportamento ou modificar seu funcionamento sem reescrever o código original.

## **Em Java:**

## class Veiculo {
    String marca;
    int ano;
    void ligar() {
        System.out.println("O veículo está ligado.");
    }
}
## class Carro extends Veiculo {
    int numPortas;
    void abrirPorta() {
        System.out.println("Porta aberta.");
    }
}
## class Animal {
    void respirar() {
        System.out.println("Animal respirando.");
    }
}
## class Mamifero extends Animal {
    void amamentar() {
        System.out.println("Mamífero amamentando.");
    }
}

## class Forma {
    void desenhar() {
        System.out.println("Desenhando forma.");
    }
}

## class Circulo extends Forma {
    void calcularArea() {
        System.out.println("Calculando área do círculo.");
    }
}
## class Pessoa {
    String nome;
}

## class Estudante extends Pessoa {
    int matricula;
}
## class Eletronico {
    void ligar() {
        System.out.println("Dispositivo eletrônico ligado.");
    }
}

## class Smartphone extends Eletronico {
    void fazerLigacao() {
        System.out.println("Realizando ligação.");
    }
} 
## **Em C++:**
## class Veiculo {
public:
    string marca;
    int ano;
    void ligar() {
        cout << "O veículo está ligado." << endl;
    }
};

## class Carro : public Veiculo {
public:
    int numPortas;
    void abrirPorta() {
        cout << "Porta aberta." << endl;
    }
};
## class Animal {
public:
    void respirar() {
        cout << "Animal respirando." << endl;
    }
};

## class Mamifero : public Animal {
public:
    void amamentar() {
        cout << "Mamífero amamentando." << endl;
    }
};

## class Forma {
public:
    void desenhar() {
        cout << "Desenhando forma." << endl;
    }
};

## class Circulo : public Forma {
public:
    void calcularArea() {
        cout << "Calculando área do círculo." << endl;
    }
};

## class Pessoa {
public:
    string nome;
};

## class Estudante : public Pessoa {
public:
    int matricula;
};

## class Eletronico {
public:
    void ligar() {
        cout << "Dispositivo eletrônico ligado." << endl;
    }
};

## class Smartphone : public Eletronico {
public:
    void fazerLigacao() {
        cout << "Realizando ligação." << endl;
    }
};
