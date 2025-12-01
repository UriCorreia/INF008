Questão 2: Sistema de Gestão do Zoológico Municipal
Você foi contratado para desenvolver o módulo de controle de animais do novo sistema do zoológico da cidade. O sistema precisa lidar com a diversidade dos animais, garantindo que características comuns sejam reaproveitadas, mas respeitando as particularidades de cada espécie.

Requisitos do Sistema:

Todo animal cadastrado no sistema possui um nome e uma idade. Além disso, o zoológico exige que "todos os animais possuam um comportamento padrão de dormir", que apenas exibe uma mensagem indicando que o animal está descansando. Porém, cada espécie se comunica de forma distinta; portanto, o sistema deve garantir que "qualquer tipo de animal saiba emitir som", "mas a implementação desse som deve ser exclusiva de cada espécie."

O zoológico também possui uma área de shows aquáticos e apresentações. Nem todo animal pode participar dessas apresentações. Apenas animais que possuem a capacidade de ser treinados devem ter um comportamento específico para realizar um truque.

Sua tarefa é implementar a modelagem orientada a objetos para este cenário:

"Modele as classes para representar um Leão, um Golfinho e um Cachorro."

O Leão é um animal selvagem e apenas emite seu rugido.

O Golfinho e o Cachorro, além de emitirem seus sons característicos, são animais aptos a apresentações e possuem truques específicos.

Crie uma classe principal de execução que armazene todos esses animais em uma única coleção (lista).

O programa deve percorrer essa lista e, para cada animal, exibir seu nome e fazê-lo emitir som. Caso o animal em questão seja apto a apresentações (treinável), o sistema deve identificar essa capacidade dinamicamente e ordenar que ele execute seu truque.