package Redes;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class Usuario {

        private String nome;
        private LocalDateTime dataHora = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" dd / MM / yyyy HH:mm ");
        String DataHhf = dataHora.format(formatter);
        private List<String> Pessoas_Que_Acompanho = new ArrayList<>();
        private List<String> mural = new ArrayList<>();

        public Usuario(String nome) {
            this.nome = nome;
            this.mural = new ArrayList<>();
            this.Pessoas_Que_Acompanho = new ArrayList<>();

        }
        public void postar(String nome, String mensagem) throws IOException {
            if (getNome() != null && mensagem != null) {
                mural.add(getNome() + " → " + mensagem + " ( " + DataHhf + ")");
                new IOException(" Post realizado com sucesso no mural de " + getNome());
            } else {
                new IOException(" Verifique o nome do usuário e a mensagem ");
            }
        }
        public void Seguir(String pessoa) throws IOException {
            if (!Pessoas_Que_Acompanho.contains(pessoa)) {
                Pessoas_Que_Acompanho.add(pessoa);
            } else {
                new IOException(" Usuário já exite");

            }
        }
        public void VisualisarMural() throws IOException {
            for (String mensagem : mural) {
                System.out.println(mensagem);
            }

        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }

}
