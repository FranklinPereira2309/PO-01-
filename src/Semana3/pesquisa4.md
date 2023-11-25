Em Java, o bloco `try-catch` é uma estrutura usada para lidar com exceções durante a execução de um programa. Ele permite que você envolva um bloco de código suscetível a lançar exceções dentro de um bloco `try` e forneça um bloco `catch` para capturar e lidar com essas exceções.

A estrutura básica para lidar com exceções em Java envolve três blocos principais:

1. **Bloco Try:** Contém o código que pode lançar uma exceção. Se ocorrer uma exceção, o controle é transferido para o bloco catch correspondente.

2. **Bloco Catch:** Responsável por capturar e lidar com a exceção lançada no bloco try. O tipo de exceção que pode ser capturado é especificado entre parênteses.

3. **Bloco Finally (opcional):** Pode ser usado para definir código que será executado independentemente de ocorrer ou não uma exceção. Este bloco é opcional, mas se for utilizado, o código dentro dele será executado, mesmo que não haja uma exceção.

```java
try {
    // código que pode lançar uma exceção
} catch (TipoDeExcecao e) {
    // código para lidar com a exceção
} finally {
    // código a ser executado sempre, ocorrendo ou não uma exceção
  
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
