package Redes;

import java.util.ArrayList;
import java.util.List;

public class RedeSocial {

        private List<String> usuarios=new ArrayList<String>();

        private List <String> mural =new ArrayList<>();

        public void LerMural(){

        }

        public void postar(String nome,String mensagem){
            if(nome!=null && mensagem!=null){
                mural.add(mensagem);
            }

        }
        public void adicionarUsuario(String nome) {
            if (!usuarios.contains(nome)) {
                usuarios.add(nome);
            }
        }

    }


}
