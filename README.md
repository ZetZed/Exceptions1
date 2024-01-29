# Tratamentos de Exceptions
## Problema exemplo
Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
novamente a reserva com os dados atualizados. O programa não deve aceitar dados
inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada
### Solução 1 - commit 1 - (muito ruim):
Lógica de validação no programa principal.
* Lógica de validação não delegada à reserva.
### Solução 2 - commit 2 - (ruim):
Método retornando String.
* A semântica da operação é prejudicada:
  * Retornar String não tem nada a ver com atualização de reserva;
  * E se a operação tivesse que retornar um String?
* Ainda não é possível tratar exceções em construtores;
* Ainda não há auxílio do compilador> o programa deve "lembrar" de verificar se houve erro;
* A lógica fica estruturada em condicionais aninhadas.
### Solução 3 - commit 3 - (boa):
Tratamento de exceções.
