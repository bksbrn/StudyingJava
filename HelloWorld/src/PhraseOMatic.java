public class PhraseOMatic {
    public static void main(String[] args) {
       // crie três conjuntos de palavras onde será feita a seleção. Adicione onde quiser!
       
       String[] wordListOne = {"24/7", "várias camadas", "30.000 pés", "B-to-B", "todos ganham", "front-end", "baseado na web", "difundido", "inteligente", "seis sigma", "caminho críico", "dinâmico"};

       String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "orientado", "central", "distribuído", "agrupado", "solidificação", "independente da máquina", "posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelarado"};

       String[] wordListThree = {"processo", "ponto máximo", "solução", "arquitetura", "habilitação no núcleo", "estratégia", "mindshare", "portal", "espaço", "visão", "paradigma", "missão"};

       // descubra quantas palavras existem em cada lista
       int oneLength = wordListOne.length;
       int twoLength = wordListTwo.length;
       int threeLength = wordListThree.length;

       // gere três números aleatórios
       int rand1 = (int) (Math.random() * oneLength);
       int rand2 = (int) (Math.random() * twoLength);
       int rand3 = (int) (Math.random() * threeLength);

       // agora constru uma frase
       String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

       // exiba a frase
       System.out.println("Precisamos de " + phrase);


    }

}