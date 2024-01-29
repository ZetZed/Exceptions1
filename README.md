# Tratamentos de Exceptions
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
