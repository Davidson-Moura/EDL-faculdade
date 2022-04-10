package T5

class Base {
    def getText( text:String): String = getTextLanguageSystem(text)

    def getTextLanguageSystem( key:String ) : String = {
        ... //Função para pegar a frase de chave 'key' em um arquivo de acordo com o idioma.
            // Exemplo de de arquivos: pt-br.properties, en-US.properties, ... 
    }
}
