package T5

object Formatter {
    def formatAddress (label: String): String =  {
        self: Base =>   //Especifica que o 'this' se referência a um objeto do tipo Base

        if (label == 'ShipTo') {
            return this.getText('Commom.ShipToDefault'); //Endereço de envio padrão
        } else {
            return this.getText('Commom.BillToDefault'); //Endereço de cobrança padrão
        }
    }
    ...
}