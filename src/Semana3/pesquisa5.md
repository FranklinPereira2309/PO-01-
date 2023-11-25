# Exceções Personalizadas em Java

Em Java, criar suas próprias exceções personalizadas é apropriado quando você encontra situações específicas no seu programa que não podem ser adequadamente representadas por exceções padrão do Java. Isso permite que você forneça informações mais específicas sobre o erro e torne o tratamento de exceções mais contextualizado.

## Como Criar Exceções Personalizadas:

Para criar uma exceção personalizada em Java, você geralmente segue os seguintes passos:

1. **Criar uma Classe para a Exceção:**
   - Crie uma classe que estende a classe `Exception` ou uma de suas subclasses (como `RuntimeException`).

   ```java
   public class MinhaExcecaoPersonalizada extends Exception {
       // Construtor da exceção personalizada
       public MinhaExcecaoPersonalizada(String mensagem) {
           super(mensagem);
       }
   }
1. Utilizar a Exceção Personalizada no Código:

Em situações específicas do seu código, lance a exceção personalizada quando a condição que
justifica a exceção ocorrer.

public class ExemploClasse {
    public void meuMetodo(int valor) throws MinhaExcecaoPersonalizada {
        if (valor < 0) {
            throw new MinhaExcecaoPersonalizada("Valor não pode ser negativo");
        }
        // Restante do código
    }
}

Exemplo de Uso:
Suponha que você esteja implementando um sistema de gerenciamento de contas bancárias e deseja 
garantir que o saldo da conta não seja negativo. Nesse caso, você pode criar uma exceção personalizada para lidar 
com essa situação:

public class SaldoNegativoException extends Exception {
    public SaldoNegativoException(String mensagem) {
        super(mensagem);
    }
}

public class ContaBancaria {
    private double saldo;

    public void debitar(double valor) throws SaldoNegativoException {
        if (saldo - valor < 0) {
            throw new SaldoNegativoException("Saldo insuficiente para debitar " + valor);
        }
        saldo -= valor;
    }
}

Ao criar uma exceção personalizada, você fornece informações adicionais sobre a natureza 
específica do erro, facilitando o tratamento adequado nos blocos catch e fornecendo mensagens 
mais significativas para a depuração do código.