import java.util.*;


public class Main {
    public static void main(String[] args) {

//        Word ciao = new Word("ciao");
//
        Scanner scn = new Scanner(System.in);
//        System.out.println("Inserisci un numero");
//        int n = scn.nextInt();
//        System.out.println("Inserisci " + n + " parole");
//        String parole = scn.nextLine();
//        Set<Word> wordSet = new HashSet<>();
//        wordSet.add(new Word(parole) );
//------------------------------------------------------------------------------------

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add((int) (Math.random()*101));
        }
        Collections.sort(integerList);
        System.out.println(integerList);
        integerList.sort(Collections.reverseOrder());
        System.out.println(integerList);

        //------------------------------------------------------------------------------------
        Map<String, Integer> rubrica = new HashMap<>();
        rubrica.put("giovanni", 345);
        rubrica.put("luca", 123);
        rubrica.put("anacleto", 678);

        System.out.println("Vuoi registrare un nuovo numero? s/n. Premi -c- per cercare un numero. Premi -v- per visualizzare la rubrica.");
        String ans = scn.nextLine();

        if (Objects.equals(ans, "s")) {
            System.out.println("metti il nome del nuovo numero");
            String name = scn.nextLine();
            System.out.println("il cellulare");
            int cell = scn.nextInt();
            rubrica.put(name, cell);
        } else if (Objects.equals(ans, "n")) {
            System.out.println("allora vuoi eliminare un numero?");
            System.out.println("scrivi qui il nome");
            String del = scn.nextLine();
            rubrica.remove(del);
        } else if (Objects.equals(ans, "c")){
            System.out.println("Vuoi cercare un contatto per nome o per numero? name/num");
            String r = scn.nextLine();
            if (Objects.equals(r, "name")){
                System.out.println("cerca un numero, scrivi qua il nome del contatto");
                String search = scn.nextLine();
                System.out.println(rubrica.get(search));
            } else if (Objects.equals(r, "num")) {
                System.out.println("metti qua il numero per trovare il nome:");
                int v = scn.nextInt();
                for (Map.Entry<String, Integer> entry : rubrica.entrySet()){
                    if (entry.getValue() == v){
                        System.out.println(entry.getKey());}
                }
            }
        }  else if (Objects.equals(ans, "v")) {
            System.out.println(rubrica);
        } else System.err.println("errore riprova");
    }
}