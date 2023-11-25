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
