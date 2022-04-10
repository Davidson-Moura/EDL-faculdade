package T5

object Main extends Base{
    def main(args: Array[String]){
        var formatter = new Formatter();

        var text = formatter.formatAddress("ShipTo"); //formata o texto de acordo com a tela.

        var label = this.getText('Commom.Address'); //retorna o texto de endereço de acordo com o idioma.

        println( label +": "+ text ); // Pelo arquivo pt-br.properties: Endereço: <Endereço de envio padrão para aquele idioma>
    }
}

/*

    1 - O objetivo do Formatter formata qualquer conteúdo que é apresentado visualmente. Assim, quando a tela não precisa de nenhuma formatação ele não é chamado.
        #O intuito é carregar as funções do objeto formatter apenas nas telas que forem necessárias formatar alguma informação (Diminuir a carga de carregamento). 

    4 - Sem a funcionalidade 'self', existem duas soluções em outras linguagens.
    - Passar a função 'getText' para a função 'formatteAddress' (função de alta ordem) ou Objeto  Main para a função 'formatteAddress'. Exemplo: def formatAddress (that: Main, label: String): String =  {...}
    - Mover a função 'formatAddress' para a class 'Base', tornando o carregamento da função em todas as telas do programa.

    5 - O principal Complicação seria passar a função 'getText' como parametro em varias funções consecutivas. 
        - Exemplo:  formatAddress("ShipTo", this.getText ) ;
                    // implementação: formatAddress ( label, func){
                        ...
                        return outraFuncao(func); //Dentro de formatter chamar outra função que dependa do "getText".
                        ...
                    }
                    
    # Com o uso do self se torna mais prático se referênciar a objetos.
        
        Base <- Main <- Formatter
        
        O self "sobe" o 'this' para os objetos superiores.

*/