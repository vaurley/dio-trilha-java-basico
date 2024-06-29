public class formatarCepExemplo {
   public static void main(String[] args) {
    try {
        String cepFormatado = formatarCep("62265000");
        System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
        System.out.println("O CEP NÃO TEM 8 DÍGITOS");
    }
       
} 
static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8)
      throw new CepInvalidoException();
    
      //simulando um cep formatado
      return "62.265-000";
}

}
