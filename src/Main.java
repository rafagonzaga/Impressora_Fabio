public class Main {

    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNome("Contrato 1");
        contrato.setTipo("Tipo X");

        Documento documento = new Documento();
        documento.setNome("Documento 1");
        documento.setTipo("Tipo x");

        Foto foto = new Foto();
        foto.setNome("Foto 1");
        foto.setTipo("Tipo x");

        Impressora.adicionarDocumento(contrato);
        Impressora.adicionarDocumento(documento);
        Impressora.adicionarDocumento(foto);

        Impressora.imprimirTodos();
    }

}
