public class TesteConversaoExplicitaFloat {

    public static void main(String[] args) {
        float quantidadeFloat = 22.12f;
        byte quantidadeByte = (byte) quantidadeFloat;

        System.out.printf("Quantidade float: %.2f", quantidadeFloat);
        System.out.printf("\nQuantidade byte: %d", quantidadeByte);
    }
}
