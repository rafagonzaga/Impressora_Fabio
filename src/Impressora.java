public abstract class Impressora {

    private static Imprimivel [] documentos = new Imprimivel[10];

    public static void adicionarDocumento(Imprimivel imprimivel) {
        for (int i=0; i < documentos.length; i++)
            if(documentos[i] == null) {
                documentos[i] = imprimivel;
                break;
            }
    }

    public static void imprimirTodos() {
        for(int i=0; i < documentos.length; i++) {
            if(documentos[i] == null) {
                break;
            } else {
                documentos[i].imprimir();
            }
        }
    }


}
