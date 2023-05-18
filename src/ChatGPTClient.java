public class ChatGPTClient {
    public String criarPergunta(
        String OPENAI_API_KEY,
        String assunto,
        String tipo,
        String dificuldade,
        String perguntaExemplo
    ) throws Exception {

        String prompt =
        """
        Elabora uma questão sobre %s
        Do tipo %s%s.
        Nivel de dificuldade: %s.
        %s%s
        """.formatted(assunto, 
        tipo, 
        tipo.equalsIgnoreCase("alternativa") ? "com 4 alternativas": "",
        dificuldade,
        perguntaExemplo == null ? "" : "Use a seguinte pergunta como exemplo: ",
        perguntaExemplo == null ? "" : perguntaExemplo
        );
        System.out.println(prompt);
        return null;
    }
}
