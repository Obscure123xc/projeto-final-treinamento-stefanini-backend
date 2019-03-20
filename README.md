# projeto-final-treinamento-stefanini-backend
Projeto Final Treinamento Stefanini - back-end Modelo Projeto 5
Ricardo Augusto Barbosa Numero: 19 (Armário tem camisetas)

# CRUD

GET: OK
POST: OK
PUT : OK
DELETE: OK

No projeto Back-End o desafio maior foi entender como funcionava a interessão com SpringBoot para criação dos metodos para o CRUD, depois que passou dessa fase o processo de criação dos destes metodos foram mais naturais e tambem devido as dicas durante o treinamento e auxilo do Professor, depois das criações do GET,POST,PUT e suas rotas, chegou a hora de fazer as regras de negocio que sao elas:

Validações importantes
No cadastro, os campos nomes (Entidade pai e filha) não podem ultrapassar 20 caracteres; 
Uma Entidade Pai não pode ter mais de 5 filhos;
O campo nome da entidade pai não pode ser repetido em outra entidade pai;

Em relação as regras de negócio a validação dos campos nomes Armário e Camisetas não pode ultrapassar 20 caracteres nos campos da entidade Pai e Filho, conseguir fazer a validação em relação ao Pai, mas o Filho conseguir validar os nomes devido não criar uma service, controller e repository para a entidade Filho chequei a essa conclusão pois nos teste no POSTMAN vi que ao ultrapassar os vinte caracteres da entidade Filho o mesmo fazia inserção no banco, mas se fizesse com entidade Pai não aconteceria a inserção mostrando uma mensagem: "Números de caracteres maior que 20", o mesmo acontece com PUT, já em relação a entidade PAI não poder ter mais do que 5 Filhos este estar funcionando dos dois verbos HTTP POST e PUT, na última validação solicitada não conseguir validar, tentei de várias formas como tentar usar equals (esse conseguir parcialmente mas só tinha exercerão se id_armario não fosse null) ,também  tentei pegar o ID já inserido no banco e vê se o nome na Lista de Armários tinha algum parecido com o novo inserido, outra forma foi tentar usar o compareTo mais a comparação não ocorreu devido um ser  campo de String e outro Boolean. Outro problema foi buscar os filhos pois depois que foram inseridos durante o POST ou PUT mesmo com a confirmação de que os dados estavam na tabela correspondente as suas Classes não trazia os filhos com seus respectivos Pais, a solução foi usar um Arrow functions para pegar o pai setar o id no filho correspondente assim mostrando PAI e seus Filhos na lista, essa solução foi dada pelo Professor Wesley mas o mesmo comentou que essa solução não era definitiva pois poderia haver uma solução mas performática.

# Back-End

Usar o POSTMAN para compular a tabela usando o POST ou usar o sql de test(poder haver erro de sequences devido nao atualizar no banco as sequences )
para testar o GET: localhost:8080/armario
para testar o Buscar: localhost:8080/armario/buscar/{id}
para testar o POST : localhost:8080/armario/salvar
para testar o PUT : localhost:8080/armario/editar
para testar o DELETE: localhost:8080/armario/excluir/{id}






