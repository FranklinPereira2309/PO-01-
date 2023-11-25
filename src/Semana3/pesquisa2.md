# Exceções Verificadas e Não Verificadas em Java

Em Java, as exceções são categorizadas em dois tipos principais: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions). A principal diferença entre elas está na obrigatoriedade de tratamento durante a compilação do código.

## Exceções Verificadas (Checked Exceptions)

As exceções verificadas são aquelas que o compilador exige que sejam tratadas explicitamente no código ou declaradas na cláusula `throws` da assinatura do método. Se um método lança uma exceção verificada, o código que o chama precisa lidar com essa exceção. Exemplos comuns de exceções verificadas incluem `IOException` e `SQLException`.

Exemplo:

```java
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExcecaoVerificadaExemplo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("arquivo.txt"); // Pode lançar FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        }
    }
}

Exceções Não Verificadas (Unchecked Exceptions)
As exceções não verificadas são aquelas que não exigem tratamento obrigatório durante a compilação. Geralmente, são subtipos de RuntimeException. Exemplos comuns incluem NullPointerException e ArrayIndexOutOfBoundsException. O tratamento dessas exceções é opcional.

Exemplo:

public class ExcecaoNaoVerificadaExemplo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(array[5]); // Pode lançar ArrayIndexOutOfBoundsException
    }
}

Em resumo, exceções verificadas são obrigatórias de serem tratadas ou declaradas, enquanto exceções não verificadas não impõem essa obrigação durante a compilação.
