Em Java, uma exceção é um evento que ocorre durante a execução de um programa e que interrompe o fluxo normal de instruções. As exceções são usadas para lidar com situações excepcionais que podem ocorrer durante a execução de um programa, como erros de entrada de dados, divisões por zero, acesso a índices inválidos em arrays, entre outros.

O propósito principal de usar exceções em programas Java é lidar com erros e situações imprevistas de maneira controlada e estruturada. Ao lançar uma exceção, você pode sinalizar que algo deu errado e permitir que o programa saia do fluxo normal de execução e entre em um bloco de código especial chamado "bloco de captura de exceção" (ou "catch block"). Isso oferece a oportunidade de tratar o erro de uma maneira adequada, como exibir uma mensagem de erro, realizar ações de recuperação, ou até mesmo encerrar o programa de uma maneira controlada.
```
try {
    // código que pode lançar uma exceção
} catch (TipoDeExcecao e) {
    // código para lidar com a exceção
} finally {
    // código a ser executado sempre, ocorrendo ou não uma exceção
}


