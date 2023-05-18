public class TestePrompt {
    public static void main(String [] args) throws Exception{
        var ChatGPTClient = new ChatGPTClient();

        ChatGPTClient.criarPergunta(null, 
        "Java", 
        "dissertativa", 
        "ultra hard core", 
        "Por que o céu é azul?");
    }
}
