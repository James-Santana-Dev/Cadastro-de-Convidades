fun main(args: Array<String>) {
   /* 2. Crie um loop (pode ser usado o while) e coloque um when dentro da estrutura, para simular um menu
   de escolhas:]
    - O Loop precisa ficar ativo enquanto uma variável simNao estiver como "Sim", a partir do momento
    que o usuário digitar "Não" ou qualquer outra coisa, o programa precisa ser finalizado.
    - Se o usuário escolher 1, abre as instruções para adicionar um novo convidado
    - Se o usuário escolher 2, abre as instruções para remover um convidado
    - Se o usuário escolher 3, lista os convidados

    3. Use a List para cadastrar cada convidado

    4. Teste para ver se tudo funciona

    */


        var convidados = mutableListOf(
            "Maria", "João", "José", "Claudia", "Rafael", "Joana"
        )

        while (true){

            print("Deseja prosseguir?: ")
            var simNao = readLine()!!

            if (simNao != "Sim"){
                break
            }
            var num = 0
            print("Digite 1 para adicionar um usuário" +
                    "\nDigite 2 para remover um usuário" +
                    "\nOu digite 3 para mostrar lista: ")
            num = readLine()!!.toInt()

            when(num){

                1 ->   if (num == 1){
                    print("Adicione uma pessoa para sua lista de convidados: ")
                    var nomeadicionado = readLine()!!
                    convidados.add(nomeadicionado)
                }
                2 ->   if (num == 2){
                    print("Remova uma pessoa da sua lista de convidados: ")
                    var nomeremovido = readLine()!!
                    convidados.remove(nomeremovido)
                }
                3 ->   if(num == 3){
                    println("\n$convidados")

                }

            }


















        }



    }